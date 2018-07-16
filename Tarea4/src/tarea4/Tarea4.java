
package tarea4;

import java.util.Scanner;

/**
 *
 * @author Alexa
 */
public class Tarea4 {

  
    public static void main(String[] args) {
        Maze m = new Maze();
        Game ga = new Game();
        
        Scanner scan= new Scanner(System.in);
        int option;
        
        do {
            System.out.println("Salir del laberinto");
            System.out.println("2 = Punto inicial ");
            System.out.println("1 = pared");
            System.out.println("0= Lugar seguro");
            System.out.println(" Solo tiene 4 vidas");
            System.out.println("1.Laberinto 7x7 ");
            System.out.println("2.Laberinto 9x9 ");
            System.out.println("3.Laberinto 6x6 ");
            System.out.println("4.Salir");
            System.out.println("Selecciona un laberinto: ");
            option = scan.nextInt();

            switch (option) {

                case 1:
                    ga.Start(m.mazeOne(), m.rowMove(m.mazeOne()), m.columnMove(m.mazeOne()));

                    break;
                case 2:
                    ga.Start(m.mazeTwo(), m.rowMove(m.mazeTwo()), m.columnMove(m.mazeTwo()));

                    break;
                case 3:
                    ga.Start(m.mazeThree(), m.rowMove(m.mazeThree()), m.columnMove(m.mazeThree()));

                    break;
                case 4:
                    System.out.println("Saliste del juego");
                    
                    break;
                default:
                    System.out.println("Selecciona un laberinto de la lista :)");
            }
       

       } while (option != 4);
        }
    }
    
