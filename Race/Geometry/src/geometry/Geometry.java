/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import java.util.Scanner;

/**
 *
 * @author Alexa
 */
public class Geometry {

   
    public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int option;
        int option2;

        while (!salir) {

            System.out.println("1. Perimetro");
            System.out.println("2. Area");
            System.out.println("3. Salir");

            System.out.println("Escribe una de las opciones");
            option = sn.nextInt();
            System.out.println("");

            switch (option) {
                case 1:

                    System.out.println("1. Cuadrado");
                    System.out.println("2. Rectangulo");
                    System.out.println("3. Circulo");
                    System.out.println("4. Triangulo Equilatero");
                    System.out.println("5. Triangulo Isosceles");
                    System.out.println("6. Pentagono Regular");
                    System.out.println("7. Salir");
                    System.out.println("Escribe una de las opciones");
                    option2 = sn.nextInt();
                    System.out.println("");

                    switch (option2) {
                        case 1:
                            System.out.println("¿Cuanto miden los lados del cuadrado? ");
                            Cuadrado squareP = new Cuadrado(sn.nextDouble());
                            squareP.perimeterSquare();
                            break;

                        case 2:
                            System.out.println("¿Cuanto mide el lado A y el lado B del rectangulo?");
                            Rectangulo rectangelP = new Rectangulo(sn.nextDouble(), sn.nextDouble());
                            rectangelP.perimeterRectangel();
                            break;

                        case 3:
                            System.out.println("¿Cuanto mide el radio del circulo? ");
                            Circulo circleP = new Circulo(sn.nextDouble());
                            circleP.perimeterCircle();

                            break;

                        case 4:
                            System.out.println("¿Cuanto mide el lado del triangulo equilatero?");
                            TrianguloEquilatero triangleE = new TrianguloEquilatero(sn.nextDouble());
                            triangleE.perimeterTriangelE();
                            break;
                        case 5:
                            System.out.println("¿Cuanto mide el lado A y el lado B? (Separe los datos con un espacio)");
                            trianguloIsoceles triangleI = new trianguloIsoceles(sn.nextDouble(), sn.nextDouble());
                            triangleI.perimeterTriangelI();
                            break;
                        case 6:
                            System.out.println("¿Cuanto mide el lado del pentagono?");
                            PentagonoRegular pentagonR = new PentagonoRegular(sn.nextDouble());
                            pentagonR.perimeterPentagon();
                            break;

                        case 7:
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 7");
                            System.out.println("");

                    }

                    break;
                case 2:
                    System.out.println("Área");
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Rectangulo");
                    System.out.println("3. Circulo");
                    System.out.println("4. Triangulo Equilatero");
                    System.out.println("5. Triangulo Isosceles");
                    System.out.println("6. Pentagono Regular");
                    System.out.println("7. Salir");

                    System.out.println("Escribe una de las opciones");
                    option2 = sn.nextInt();
                    System.out.println("");

                    switch (option2) {
                        case 1:
                            System.out.println("¿Cuanto miden los lados del cuadrado? ");
                            Cuadrado squareA = new Cuadrado(sn.nextDouble());
                            squareA.areaSquare();
                            break;

                        case 2:
                            System.out.println("¿Cuanto mide el lado A y el lado B del rectangulo?");
                            Rectangulo rectangleA = new Rectangulo(sn.nextDouble(), sn.nextDouble());
                            rectangleA.areaRectangel();
                            break;

                        case 3:
                            System.out.println("¿Cuanto mide el radio del circulo? ");
                            Circulo circleA = new Circulo(sn.nextDouble());
                            circleA.areaCircle();
                            break;
                        case 4:
                            System.out.println("¿Cuanto mide el lado del triangulo equilatero?");
                            TrianguloEquilatero triangleE = new TrianguloEquilatero(sn.nextDouble());
                            triangleE.areaTriangelE();
                            break;

                        case 5:
                            System.out.println("¿Cuanto mide el lado A y el lado B?");
                            trianguloIsoceles triangleI = new trianguloIsoceles(sn.nextDouble(), sn.nextDouble());
                            triangleI.areaTriangelI();
                            break;

                        case 6:
                            System.out.println("¿Cuanto mide el lado del pentagono?");
                            PentagonoRegular pentagonR = new PentagonoRegular(sn.nextDouble());
                            pentagonR.areaPentagon();
                            break;

                        case 7:
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 7");
                            System.out.println("");

                    }

                    break;

                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
                    System.out.println("");
            }

        }

    }
}
    
    

