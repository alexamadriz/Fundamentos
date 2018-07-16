
package tarea4;

import java.util.Scanner;

/**
 *
 * @author Alexa
 */
public class Game {
    
Scanner scan = new Scanner(System.in);
    
    public void Start(String[][] matrix, int row, int column) {
        
        int fail = 0;
        
        Maze x = new Maze();
        
        int [] position = x.pstnX(matrix);
        
        while (fail < 4) {

            if (matrix[row][column] == null ? matrix[position[0]][position[1]] == null : matrix[row][column].equals(matrix[position[0]][position[1]])){
                System.out.println("¡ÉXITO!");
                fail += 4;
                 
             } else {
               showMatrix(matrix);
                System.out.println("Directions: Up (U) -  Down (D) -  Right (R) - Left (L) ");
                System.out.println(" DIRECCIÓN DEL MOVIMIENTO: ");
                String direction = scan.next();
                
               
               if (direction.equalsIgnoreCase("R")) {
                    if (!matrix[row][column + 1].equals("1")) {
                       matrix[row][column + 1] = "2";
                       matrix[row][column] = "0";
                       column++;
                    } else {
                        fail++;
                        System.out.println(":( " + fail + " de 4 fallos" );
                        System.out.println(" ");
                    }
                }

               
                if (direction.equalsIgnoreCase("L")) {
                    if (!matrix[row][column - 1].equals("1")) {
                        matrix[row][column - 1] = "2";
                        matrix[row][column] = "0";
                        column--;
                    } else {
                        fail++;
                        System.out.println(":( " + fail + " de 4 fallos" );
                        System.out.println(" ");
                   }
                }

                    if (direction.equalsIgnoreCase("U")) {
                    if (!matrix[row - 1][column].equals("1")) {
                        matrix[row - 1][column] = "2";
                        matrix[row][column] = "0";
                        row--;
                   } else {
                        fail++;
                        System.out.println(":( " + fail + " de 4 fallos" );
                        System.out.println(" ");
                    }
                }

                
                if (direction.equalsIgnoreCase("D")) {
                    if (!matrix[row + 1][column].equals("a")) {
                        matrix[row + 1][column] = "2";
                        matrix[row][column] = "0";
                        row++;
                    } else {
                        fail++;
                        System.out.println(":( " + fail + "  4 fallos" );
                       
                    }
                }
            }
            
        }
       
        System.out.println("¡PERDIDO!");
       
        
        
        
    }

            public void showMatrix(String[][] matrix) {
            for (String[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix1[j] + "  ");
        }
            System.out.println();
    }
    }
}

    

