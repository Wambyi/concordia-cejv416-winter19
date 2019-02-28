/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week6.class1.exercise3_abstract;

/**
 *
 * @author gl_dani
 */
public class Car extends Vehicle {
    
    private boolean hasHitch;
    
    public Car(boolean hasHitch, double fuelCapacity, double weight, String colour) {
        super(fuelCapacity, weight, colour);
        this.hasHitch = hasHitch;
    }
    

    //method
    public double getDistance (){  // public becasue it would be called from the outside
        return super.getDistance();     // return distance from super class
    }
    
    protected String getDescription(){
        return "I am a car and I'm a consumer vehicle";
    }
    
    // method to return String from super class 'Vehicle'
    public String toString(){
        return "My class type is Car"
                + "; fuel capacity : " + this.fuelCapacity 
                + "; weight is : " + this.weight 
                + " and my colour is : " + this.colour;
    }  
    
}
