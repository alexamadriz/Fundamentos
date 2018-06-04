/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author Kath
 */
public class Password {
  public Boolean verify(String pass){
 
            pass = "Ulacit1#";
            
            if (pass.length()<6){
                System.out.println("La contraseña debe contener mas de 6 caracteres");
                
            } 
                boolean number = false;
                boolean especial = false;
            
            for (char c : pass.toCharArray()){
                if (Character.isDigit(c)){
                    number = true;
                } else if (c == '#' || c == '&');{
                especial = true;
                
                
            }
            }
            return number && especial;
           
  
  }}
        
            
        
        
        
