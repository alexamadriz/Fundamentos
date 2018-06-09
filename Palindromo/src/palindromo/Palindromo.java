/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;
import java.util.*;

/**
 *
 * @author Alexa
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sPalabra = "ala";
        
        int inc = 0;
        int des = sPalabra.length()-1;
        boolean bError= false;
        
        while ((inc<des) && (!bError)){
            
            if (sPalabra.charAt(inc) == sPalabra.charAt(des)){
                inc++;
                des--;
                
            } else {
                bError = true;
            }
            
        }
        
        if (!bError)
            System.out.println(sPalabra + " Es un palindromo ");
        else
            System.out.println(sPalabra + " NO es un palindromo ");
        
    }
}
            
        
    
     
           
       }
        
    }
    
}
}
