/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week5.class2_2;

import java.text.NumberFormat;

/**
 *
 * @author gl_dani
 */
public class Rectangle_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle (4, 40);
        Rectangle r2 = new Rectangle (3.5, 35.9);
        
        System.out.println("Information for rectangle 1");
        printInfo("Width ", r1.getWidth());
        printInfo("Length ", r1.getHeight());
        printInfo("Area ", r1.getArea());
        printInfo("Area ", r1.getPerimeter());
        
        System.out.println("Information for rectangle 2");
        printInfo("Width ", r2.getWidth());
        printInfo("Length ", r2.getHeight());
        printInfo("Area ", r2.getArea());
        printInfo("Area ", r2.getPerimeter());
        
        
        
        
    }
    
        public static void printInfo(String text, double value)
        {
            NumberFormat nf = NumberFormat.getNumberInstance();
            System.out.println(text + " : " + nf.format(value));
        }     
    
}
