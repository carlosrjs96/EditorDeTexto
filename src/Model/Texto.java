/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Font;

/**
 *
 * @author Carlos
 */
public class Texto implements Cloneable{
    private String texto;
    private Font formato;

    public Texto() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }



    public Font getFormato() {
        return formato;
    }

    public void setFormato(Font formato) {
        this.formato = formato;
    }
    
    public void restoreMemento(Memento memento){           
        Texto texto1 = memento.getEstado();           
        this.texto = texto1.getTexto();                     
        this.formato = texto1.getFormato();       
    }   
    
    public Texto clonar(){           
        try {          
            Texto text = new Texto();
            text.setTexto(this.texto);
            text.setFormato(this.formato);
            return text;         
        } catch (Exception e) {               
            throw new RuntimeException("Error al clonar el texto");           
        }       
    } 
    
}
