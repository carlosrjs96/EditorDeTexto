/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.EditorController;
import View.EditorView;

/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EditorView view = new EditorView();
        EditorController c = new EditorController(view);
        view.setVisible(true);
        //>>>>>COMPONENTE TEXT EDITOR BUSCAR<<<<<<
        
        
       /* Texto documento2 = new Texto();
        documento2.setTexto("AQUI EL TEXTO DEL DOCUEMTNO 2");
        documento2.setTamanoLetra(16);
        documento2.setItalica(true);
        documento2.setNegrita(true);
        documento2.setSubrayado(false);
       
        
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        
        originator.setEstado(documento2);//ASI GUARDA EL ESTADO ACTUAL
        //AQUI GUARDA EN LA LISTA DE MEMENTOS EL ULTIMO ESTADO
        careTaker.addMemento(originator.guardar());// MEMENTO POSICION 0
        
        Texto documento3 = new Texto();
        documento3.setTexto("AQUI EL TEXTO DEL DOCUEMTNO 3");
        documento3.setTamanoLetra(8);
        documento3.setItalica(false);
        documento3.setNegrita(false);
        documento3.setSubrayado(true);
        
        originator.setEstado(documento3);//ASI GUARDA EL ESTADO ACTUAL
        //AQUI GUARDA EN LA LISTA DE MEMENTOS EL ULTIMO ESTADO
        careTaker.addMemento(originator.guardar());// MEMENTO POSICION 1
        
        //documento3 =  new Texto(); 
        originator.restaurar(careTaker.getMemento(0));
        Texto doc = originator.getEstado();
        
        System.out.println(doc.getTexto());
        
        originator.restaurar(careTaker.getMemento(1));
        Texto doc1 = originator.getEstado();
        
        System.out.println(doc1.getTexto());
        
        */
    }
    
}
