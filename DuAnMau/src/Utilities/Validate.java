/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author OS
 */
public class Validate {
    public static boolean isEmpty(JTextField txt , String msg){
        String text = txt.getText();
        if(text.equals("")){
            JOptionPane.showMessageDialog(null, msg,"Error",JOptionPane.ERROR_MESSAGE);
            txt.requestFocus();
            return false;
        }
        return true;
    }
    
    public static boolean isEmptyPass(JPasswordField txt , String msg){
        String text = String.valueOf(txt.getText());
        if(text.equals("")){
            JOptionPane.showMessageDialog(null, msg,"Error",JOptionPane.ERROR_MESSAGE);
            txt.requestFocus();
            return false;
        }
        return true;
    }
    public static boolean isEmptyTxa(JTextArea txt , String msg){
        String text = String.valueOf(txt.getText());
        if(text.equals("")){
            JOptionPane.showMessageDialog(null, msg,"Error",JOptionPane.ERROR_MESSAGE);
            txt.requestFocus();
            return false;
        }
        return true;
    }
    
    public static boolean BTCQ(JTextField txt,String btcq, String msg){
         String text = txt.getText();
         if(!text.matches(btcq)){
            JOptionPane.showMessageDialog(null, msg,"Error",JOptionPane.ERROR_MESSAGE);
            txt.requestFocus();
            return false;
        }
        return true;
    }
}
