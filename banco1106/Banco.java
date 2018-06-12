/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco1106;
import java.util.Scanner;

/**
 *
 * @author Alexa
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      System.out.println("Que desea hacer?");
      System.out.println("Digite D = Debitar, A = Acreditar");
      
      Scanner scan = new Scanner(System.in);
      
      Cuenta cuenta = new Cuenta(scan.next());
      
      cuenta.acreditar();
      cuenta.debitar();
    }
    
}
