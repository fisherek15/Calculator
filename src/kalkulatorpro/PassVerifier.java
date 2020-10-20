/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorpro;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class PassVerifier extends InputVerifier{

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        try {
            Double.parseDouble(text);
            return true;
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            return false;
        }
    
    }
    
}
