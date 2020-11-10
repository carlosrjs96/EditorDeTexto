/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Carlos
 */
public class TextFilter extends FileFilter{

    @Override
    public boolean accept(File f) {
        if(f.getAbsolutePath().endsWith(".txt")
                ||f.getAbsolutePath().endsWith(".rft")
                ||f.getAbsolutePath().endsWith(".java")
                ||f.isDirectory()){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String getDescription() {
        return "Text Files";
    }
    
    
}
