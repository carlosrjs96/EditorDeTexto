/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Carlos
 */
public class Memento {
    private Texto estado;

    public Memento(Texto estado){
        this.estado = estado;
    }

    public Texto getEstado() {
        return estado;
    }
    
    
}
