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
public class Truck extends Vehicle {
    
    private boolean hasTrailer;
    
    //constructor - includes super class 'Vehicle'
    public Truck(boolean hasTrailer, double fuelCapacity, double weight, String colour) {
        super(fuelCapacity, weight, colour);
        this.hasTrailer = hasTrailer;
    }
 
    //method to get distance 
    public double getDistance (){
        return (super.getDistance()) - 250;
    }
    
    // method to return String from super class 'Vehicle'
    public String toString(){
        return super.toString();
    }
    
//    public String toString(){
//        return "This Object is a Truck, fuel capacity of " + this.fuelCapacity 
//                + " My weight is " + this.weight 
//                + " and my colour is " + this.colour
//                + ", Does is have trailer :" + this.hasTrailer;
//    }  
}
