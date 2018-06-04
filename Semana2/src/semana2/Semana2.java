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
public class Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       float n1= 15;
//       float n2= 8;
//       float n3= n1/ n2;
//       
//       System.out.println( n3);
//       
//       
//       
       
//      String nombre = "David";
//      int edad = 19;
//      System.out.println((nombre.length()>4 && edad >18)|| edad ==25);
//      
    Password pass= new Password ();
       Boolean isValid = pass.verify("Ulacit1#");
       
       System.out.println("El password"+ (isValid ? "": "no")+ "es valido");
    }
    
}