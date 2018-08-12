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
public class PentagonoRegular {
    private double side;

    public PentagonoRegular(double sideA) {
        side = sideA;

    }

    public double perimeterPentagon() {
        double calculatePerimeter = Math.floor(5 * side);
        System.out.println("P = " + calculatePerimeter + "cm");
        System.out.println("");
        return calculatePerimeter;
    }

    public double areaPentagon () {
        float apothem = (float) Math.sqrt((side * side) - ((side / 2) * (side / 2)));
        double perimeter = 5 * side;
        double calculateArea = Math.floor((perimeter * apothem) / 2);
        System.out.println("A = " + calculateArea + "cm");
        System.out.println("");
        return calculateArea;
}
}
