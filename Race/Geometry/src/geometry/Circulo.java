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
public class Circulo {
    private double radio;

    public Circulo(double radioA) {
        radio = radioA;

    }

    public double perimeterCircle() {
        double perimeterCalculate = Math.floor(2 * 3.1416 * radio);
        System.out.println("P = " + perimeterCalculate + "cm");
        System.out.println("");
        return perimeterCalculate;
    }

    public double areaCircle() {
        double areaCalculate = Math.floor(3.1416 * (radio * radio));
        System.out.println("A = " + areaCalculate + "cm");
        System.out.println("");
        return areaCalculate;
}
}
