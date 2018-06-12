/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco1106;

import java.util.Scanner;


public class Cuenta {
    Scanner scan = new Scanner(System.in);
    private int saldo  = 1000;
    public String decision;
    

    public Cuenta(String decisionA) {
        decision = decisionA;
    }

    public void acreditar() {
        if (decision.compareTo("a")== 0){
                System.out.println("Introduzca el monto");
            int monto = scan.nextInt();
            saldo = saldo +  monto;
            System.out.println("El saldo disponible es de: $" + saldo);
            
        }
        
        
    }
    

    public void debitar() {
        if (decision.compareTo("d")== 0){
            System.out.println("Introduzca el monto");
            int monto = scan.nextInt();   
            int remanente = saldo - monto;
         
            if (remanente >= 0){
             saldo = saldo - monto;
             System.out.println("Debito realizado, quedan: $" + saldo);
             
            }else{
             System.out.println("No tiene fondos suficientes, solo tiene: $" + saldo);
         }
        
    }
      
    }
    
}
