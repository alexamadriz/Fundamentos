/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Alexa
 */
public class Cuadrado {
    
    private double side;

    public Cuadrado(double sideA) {
        side = sideA;

    }

    public double perimeterSquare() {
        double perimeterCalculate = Math.floor(4 * side);
        System.out.println("P = " + perimeterCalculate + "cm");
        System.out.println("");
        return perimeterCalculate;
    }

    public double areaSquare() {
        double areaCalculate = Math.floor(side * side);
        System.out.println("A = " + areaCalculate + "cm");
        System.out.println("");
        return areaCalculate;
    }
}
    

