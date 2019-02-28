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
public class Rectangle2 extends GeometricObject {
    
    private double width = 1;
    private double height = 1;

    public Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    //Inludes super class (parent class)
    public Rectangle2(String color, boolean filled, Date dateCreated, double width, double height) {
        super(color, filled, dateCreated);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    //calculation starts here (calculate Area)
    public double getArea(){
        return (this.width * this.height);
    }
    
    //calculate perimeter for rectangle
    public double Perimeter(){
        return 2 *(this.width + this.height);
    }   
    
    public String toString(){
       // Object o = new Object(); //all classes inherit from a master 'object'
        
        return "Hey";
    }  
    
}
