/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg4;
import java.util.Random; 



public class Semana4 {

  
    public static void main(String[] args) {
        Random rn = new Random ();
        
        
        int i;
        
        for (i=1; i<=8;i++){
            int golesA= rn.nextInt(3) ;
            int golesB= rn.nextInt(3) ;
            int golesC= rn.nextInt(3) ;
            int golesD= rn.nextInt(3) ;
            System.out.println("Resultado de Gruop " + i) ;
            System.out.println();
            System.out.println("Equipo A " + golesA + " - Equipo B " + golesB);
            System.out.println("Equipo B " + golesB + " - Equipo D " + golesD);
            System.out.println("Equipo A " + golesA + " - Equipo C " + golesC);
            System.out.println("Equipo A " + golesA + " - Equipo D " + golesD);
            System.out.println("Equipo B " + golesB + " - Equipo C " + golesC);
            System.out.println("Equipo C " + golesC + " - Equipo D " + golesD);
            System.out.println();
    }
    }   
       
        
    }
    

