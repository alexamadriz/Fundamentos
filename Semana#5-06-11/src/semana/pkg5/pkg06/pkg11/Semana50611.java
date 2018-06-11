/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg5.pkg06.pkg11;

import java.util.Random;
import java.util.Scanner;

public class Semana50611 {

  
    public static void main(String[] args) {
        
        Random ran = new Random();
        Scanner scan = new Scanner (System.in);
        
        int numAleatorio = ran.nextInt(100);
        System.out.println("Ingrese un numero aleatorio: ");
        int numAdivinar = scan.nextInt();
        
        
    
        while (numAdivinar != numAleatorio) {
            if (numAdivinar > numAleatorio){
                System.out.println("El número es mayor");
            
           
            }else if  (numAdivinar < numAleatorio){
               
                System.out.println("El número menor");
            }
            
            System.out.println("Ingrese un numero aleatorio: ");
            numAdivinar = scan.nextInt();
                
            }
        {
            System.out.println("Ingrese un numero aleatorio: ");
          
        }
        
        
     
        
///////////////////////////////////////////////////////////////////////////////
//
//        System.out.print("Ingrese el monto a pagar: ");
//        int monto = scan.nextInt();
//        
//        //Billetes//
//        int a = 20000;
//        int b = 10000;
//        int c = 5000;
//        int d = 2000;
//        int e = 1000;
//        
//        //Monedas//
//        int f = 500;
//        int g = 100;
//        
        
        
        
        
        
        

        
    }
    
}
