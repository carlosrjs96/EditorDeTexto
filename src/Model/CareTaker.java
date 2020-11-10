/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class CareTaker {
    private int currentIndex = -1; 
    private ArrayList<Memento> mementos = new ArrayList<Memento>();
    
    
    public Memento getMemento(int index){
        return mementos.get(index);
    }
    
     public void addNewMemento(Memento m) {
        mementos.add(m);           
        currentIndex++;       
    }       
    
    public Memento getCurrentMemento() {           
        return mementos.get(currentIndex);       
    }
    
    public Memento getNextMemento() {           
        int newIndex = currentIndex +1;           
        if( newIndex >= mementos.size()){               
            return null;           
        }
        
        currentIndex = newIndex;           
        return mementos.get(currentIndex);       
    }              
    
    public Memento getPreviousMemento() {           
        int newIndex = currentIndex-1;                      
        
        if(newIndex  <= -1 || newIndex >= mementos.size()-1){               
            return null;           
        }
        currentIndex= newIndex;           
        
        return mementos.get(currentIndex);       
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public ArrayList<Memento> getMementos() {
        return mementos;
    }
    
}
