/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;

/**
 *
 * @author ulacit
 */
public class Wheels {
    private String brand;
    private int size;
    private double factor;
    
    private static final double MAX_WHEELS = 20.0;
    
    public Wheels(String brandA, int sizeA) {
        brand = brandA;
        size = sizeA;
    }
    
    
    
    public double getFactor(){
        factor = size / MAX_WHEELS;
        return factor;
        
    }
 
    
    
}
