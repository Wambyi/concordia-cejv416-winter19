/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week5.class2_2;

import java.util.Date;

/**
 *
 * @author gl_dani
 */
public class Circle extends GeometricObject{
    
    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }


    public Circle(String color, boolean filled, Date dateCreated, double radius) {
        super(color, filled, dateCreated);   //access parent class
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //calculate area
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    //calculate diameter
    public double getDiameter() {
        return this.radius *2 ;
    }
    
    //calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();  //build string
        sb.append("I am a Circle\n");
        sb.append("My radius is " + this.radius + "\n");
        sb.append("My colour is " + this.color);  //color can be accessed because it is protected (avaialble within all classes)
        
        return sb.toString();   //spit out what is in string
    }
    
    
}
