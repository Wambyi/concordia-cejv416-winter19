/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week6.class1.exercise1;

/**
 *
 * @author gl_dani
 */
public class Bus extends Vehicle {

    //constructor - includes super class
    public Bus(double fuelCapacity, double weight, String colour) {
        super(fuelCapacity, weight, colour);
    }

    //method
    public double getDistance (double fuelCapcity){
        return (super.getDistance()) - 100;
    }
    
    // method to return String from super class 'Vehicle'
    public String toString(){
        return super.toString();
    }
}
