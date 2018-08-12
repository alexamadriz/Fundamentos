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
public class Rectangulo {
    private double sideA;
    private double sideB;

    public Rectangulo(double sideA2, double sideB2) {
        sideA = sideA2;
        sideB = sideB2;
    }

    public double perimeterRectangel() {
        double perimeterCalculate = Math.floor(2 * sideA + 2 * sideB);
        System.out.println("P = " + perimeterCalculate + "cm");
        System.out.println("");
        return perimeterCalculate;
    }

    public double areaRectangel() {
        double areaCalculate = Math.floor(sideA * sideB);
        System.out.println("A = " + areaCalculate + "cm");
        System.out.println("");
        return areaCalculate;
    }

}
