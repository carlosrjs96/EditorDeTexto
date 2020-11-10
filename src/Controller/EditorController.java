/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import Model.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.rtf.RTFEditorKit;



/**
 *
 * @author Carlos
 */
public class EditorController implements ActionListener{
    EditorView view ;
    String letra = "Arial";
    CareTaker careTaker;
    Originator originator;
    Texto texto;
    int cont;
    int contGuardados;
    boolean subrayado; 

    public EditorController(EditorView _view){
        this.view = _view;
        this.careTaker = new CareTaker();
        this.originator = new Originator();
        this.texto = new Texto();
        this.texto.setFormato(new Font(letra,Font.PLAIN,10));
        this.view.jTextPane1.setFont(this.texto.getFormato());
        this.cont = 0;
        this.contGuardados = 0;
        this.subrayado = true; 
        __init__();
    }
    
    private void __init__(){
        this.view.btnGuadar.addActionListener(this);
        this.view.btnReDo.addActionListener(this);
        this.view.btnUnDo.addActionListener(this);
        this.view.btnNegrita.addActionListener(this);
        this.view.btnItalica.addActionListener(this);
        this.view.btnSubrayado.addActionListener(this);
        this.view.jcbSelectSize.addActionListener(this);
        this.view.mnNew.addActionListener(this);
        this.view.mnOpen.addActionListener(this);
        this.view.mnSaveAs.addActionListener(this);
        this.view.mnExit.addActionListener(this);
    };
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.view.btnGuadar)){
           this.btnGuadarAction();
        }else if(e.getSource().equals(this.view.btnReDo)){
           this.btnReDoAction();
        }else if(e.getSource().equals(this.view.btnUnDo)){
            this.btnUnDoAction();
        }else if(e.getSource().equals(this.view.btnNegrita)){
            this.btnNegritaAction();
        }else if(e.getSource().equals(this.view.btnItalica)){
            this.btnItalicaAction();
        }else if(e.getSource().equals(this.view.btnSubrayado)){
            this.btnSubrayadoAction();
        }else if(e.getSource().equals(this.view.jcbSelectSize)){
            System.out.println("Aqui size letra");
            this.jcbSelectSizeAction();
        }else if(e.getSource().equals(this.view.mnNew)){
            this.mnNewAction();
        }else if(e.getSource().equals(this.view.mnOpen)){
            this.mnOpenAction();
        }else if(e.getSource().equals(this.view.mnSaveAs)){
            this.mnSaveAsAction();
        }else if(e.getSource().equals(this.view.mnExit)){
            this.mnExitAsAction();
        }
    }
    
    private void updateModel(){
        this.view.jTextPane1.setText(texto.getTexto());
        this.view.jTextPane1.setFont(texto.getFormato());       
    }
    
    private void btnGuadarAction() {
        if (this.careTaker.getMementos().size() < 10) {
            Texto text = this.texto.clonar();
            text.setFormato(this.view.jTextPane1.getFont());
            text.setTexto(this.view.jTextPane1.getText());
            
            this.originator.setEstado(text);//ASI GUARDA EL ESTADO ACTUAL
            //AQUI GUARDA EN LA LISTA DE MEMENTOS EL ULTIMO ESTADO
            this.careTaker.addNewMemento(this.originator.guardar());// MEMENTO POSICION 0
            System.out.println("Tamano Caretaker en size mementos:"+this.careTaker.getMementos().size()+" Currentindex : "+this.careTaker.getCurrentIndex());
             System.out.println("Texto Guadado:" + this.view.jTextPane1.getText());
            JOptionPane.showMessageDialog(this.view, "Estado guardado");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede guardar más de 10 ediciones");
        }
    }
    
    private void btnReDoAction() {
        //this.cont
        Memento memento = careTaker.getNextMemento();          
        //System.out.println(" btnReDoAction");
        //System.out.println(" Currentindex : "+this.careTaker.getCurrentIndex());
        if(memento==null){               
            JOptionPane.showMessageDialog(this.view, "No existen más estados");               
            return;           
        }   
        //System.out.println("Texto:" + memento.getEstado().getTexto());
        this.texto.restoreMemento(memento);
        updateModel();
    }
    private void btnUnDoAction(){
        //this.cont
        Memento memento = careTaker.getPreviousMemento();      
        //System.out.println(" btnUnDoAction");
        //System.out.println(" Currentindex : "+this.careTaker.getCurrentIndex());    
        if(memento==null){               
            JOptionPane.showMessageDialog(this.view, "No existen más estados");               
            return;           
        }   
        //System.out.println("Texto:" + memento.getEstado().getTexto());
        this.texto.restoreMemento(memento);
        updateModel();
    }
    private void  btnNegritaAction(){
        Font font = this.view.jTextPane1.getFont();
        this.texto.setFormato(new Font(letra,Font.BOLD,font.getSize()));
        this.texto.setTexto(this.view.jTextPane1.getText());
        this.view.jTextPane1.setFont(this.texto.getFormato());
    }
    
    private void btnItalicaAction(){
        Font font = this.view.jTextPane1.getFont();
        this.texto.setFormato(new Font(letra,Font.ITALIC + font.getStyle(),font.getSize()));
        this.texto.setTexto(this.view.jTextPane1.getText());
        this.view.jTextPane1.setFont(this.texto.getFormato());
    }
    
    private void btnSubrayadoAction(){ 
        if(this.subrayado == true){
            this.subrayado = false;
        }else{
            this.subrayado = true;
        }
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setUnderline(attributeSet, this.subrayado);
        this.view.jTextPane1.getStyledDocument().setCharacterAttributes(0, this.view.jTextPane1.getText().length(),
                attributeSet, false);    
    }
    
    private void mnNewAction(){
        this.careTaker = new CareTaker();
        this.originator = new Originator();
        this.texto = new Texto();
        this.view.jTextPane1.setText("");
        this.texto.setFormato(new Font(letra,Font.PLAIN,12));
        this.view.jTextPane1.setFont(this.texto.getFormato());
    }
    
    private void mnOpenAction(){
        open();
    }
    
    private void mnSaveAsAction(){
        save();
    }
    
    private void mnExitAsAction(){
        System.exit(1);
    }

    private void jcbSelectSizeAction() {
        // Select size of text
        String getSize = this.view.jcbSelectSize.getSelectedItem().toString();
        Font f = this.view.jTextPane1.getFont();
        // setting new size
        this.texto.setFormato(new Font(f.getFontName(),f.getStyle(), Integer.parseInt(getSize)));
        this.texto.setTexto(this.view.jTextPane1.getText());
        this.view.jTextPane1.setFont(this.texto.getFormato());   
    }
    
    private void save() {
        JFileChooser file = new JFileChooser();
        TextFilter filter = new TextFilter();
        file.setFileFilter(filter);
        String fileName = "";
        // show save file dialog
        if (file.showSaveDialog(this.view) == JFileChooser.APPROVE_OPTION) {
        // get full path of selected file
            fileName = file.getSelectedFile().getAbsolutePath();
        // get meta of text
            StyledDocument doc = (StyledDocument) this.view.jTextPane1.getDocument();
        // convert to richtext format
            RTFEditorKit kit = new RTFEditorKit();
            BufferedOutputStream out;
            try {
                out = new BufferedOutputStream(new FileOutputStream(fileName));
        // save content to file
                kit.write(out, doc, doc.getStartPosition().getOffset(), doc.getLength());
                out.flush();
                out.close();
            } catch (Exception e) {
                System.out.println("Err:" + e.toString());
            }

        } else {
            return;
        }
    }    
        
    private void open() {
        this.view.jTextPane1.setText("");
        //this.view.jTextPane1.setFont(null);
        JFileChooser file = new JFileChooser();
        TextFilter filter = new TextFilter();
        file.setFileFilter(filter);
        String fileName = "";
        // show open file dialog
        if (file.showOpenDialog(this.view) == JFileChooser.APPROVE_OPTION) {
            fileName = file.getSelectedFile().getAbsolutePath();
        } else {
            return;
        }
        // using richtext format
        RTFEditorKit rtf = new RTFEditorKit();
        try {
        // load file into jTextPane
            FileInputStream fi = new FileInputStream(fileName);
            rtf.read(fi, this.view.jTextPane1.getDocument(), 0);
            fi.close();
        } catch (Exception e) {
            System.out.println("err:" + e.toString());
        }
        //------------------------------------------------------------
        //this.view.jTextPane1.setEditable(true);
        //this.texto.setFormato(new Font(letra,Font.PLAIN,100));
        this.view.jTextPane1.setFont(this.texto.getFormato());
       // this.view.jTextPane1.setFont(font);
        //this.texto.setFormato(this.view.jTextPane1.getFont());
    }
}

