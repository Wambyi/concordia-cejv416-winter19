/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week3.class1;

/**
 *
 * @author gl_dani
 */
public class MathsFunc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double c = 150;
        double a = 231;
        double B_deg = 123;  //angle (degree)
        
        double pi = Math.PI;
        double B_rad = (B_deg)* (pi/180);
        
        
        double area = Math.round(((double) 1/2)*(c * a * Math.sin(B_rad)));
        
        System.out.println(area);
    }
    
}
