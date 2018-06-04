/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg4.pkg1;
import java.util.Scanner;


/**
 *
 * @author ulacit
 */
public class Semana41 {
    
    public static void imprimirLineaVacia(int lado) {
        System.out.print("*");
        for (int j = 0; j < lado - 2; j++){
             System.out.print(" ");
        }
         System.out.print("*");
            
    }
    public static void imprimirLineaCompleta(int lado){
    }
    
   

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese un numero: ");
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            if (i ==0 || i == size -1){
                imprimirLineaCompleta(size);
            } else {
                imprimirLineaVacia (size);
            }
            System.out.print("\n");
            
                
            }
        }
        
       
    }
    
}
