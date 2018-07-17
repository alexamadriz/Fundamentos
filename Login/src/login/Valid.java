/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alexa
 */
public class Valid {

    
    
       public boolean isValid(JTextField txtUser,JTextField txtPassword) {
       String valid = txtUser.getText();
        boolean status;

        if (valid.contains("@gmail.com")) {
            status = true;
            JOptionPane.showMessageDialog(txtUser, "Correo Valido");
           
        } else {
            status= false;
            JOptionPane.showMessageDialog(txtUser, "¡Correo Invalido! Solo correos Gmail");
        }
        return status;
    }

}
    
    
}
