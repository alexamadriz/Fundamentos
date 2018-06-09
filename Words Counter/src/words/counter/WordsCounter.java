/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package words.counter;

/**
 *
 * @author Alexa
 */
public class WordsCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Words Counter");
       String str1 = "Today is Sunday";
       int wordCount = 1;
       
       for (int i = 0; i < str1.length (); i++)
       {
           if (str1.charAt(i)== ' ')
           {
               wordCount++;
           }
           System.out.println("Word count is = " + wordCount);
           
       }
    }
           }
       }
    }
    
}
