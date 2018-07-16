/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import java.util.Random;


public class Semana8 {

   
    public static void main(String[] args) {
     Random rn= new Random();
     
        int [] A = new int [10];
        for (int i=0; i<A.length;i++){
            A[i]= rn.nextInt(11);
        }
        int [] B = new int [10];
        for (int i=0; i<B.length;i++){
            B[i]= rn.nextInt(11);
        }
        int [] C = new int [10];
        int sum = 0;
        for (int i=0; i<C.length;i++){
            for (int x=0; x<C.length; x++){
             C[i]= A[i]* B[i];
             sum = sum + C[i];
            }
           System.out.println(sum);
        }
        
         
             
             
             
            }
            }
        
            
                
            
            
            
            
            
            
            
       
            
        
        
    
    

