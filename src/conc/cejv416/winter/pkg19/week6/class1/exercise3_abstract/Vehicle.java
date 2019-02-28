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
public abstract class Vehicle {
    
    protected double fuelCapacity;
    protected double weight;
    protected String colour;

    //constructor for the super class
    public Vehicle(double fuelCapacity, double weight, String colour) {
        this.fuelCapacity = fuelCapacity;
        this.weight = weight;
        this.colour = colour;
    }
    
    //method to calculate distance
    protected double getDistance (){  //protected - so it cannot be modified
        return (this.fuelCapacity * 10.00);
    } 
    
    protected abstract String getDescription(); // it cannot have a boby {}
}
