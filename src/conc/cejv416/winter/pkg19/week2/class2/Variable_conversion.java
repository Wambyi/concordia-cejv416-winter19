/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week2.class2;

/** This program convert 'Integer' to 'String'
 *
 * @author gl_dani
 */
public class Variable_conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables
        int first = 14; 
        int second = 3;
        
        //'Integer to String' conversion
        String x = Integer.toString(first);
        String y = Integer.toString(second);
            
        //perform certain operation while printing to console 
        System.out.println(x + " + " + y + " is " + (first + second));
        System.out.println(x + " * " + y + " is " + (first * second));
        System.out.println(x + " % " + y + " is " + (first % second));
        System.out.println(x + " / " + y + " is " + (first / second));
        
        System.out.println(x + " / " + y + " is " + ((float)first / second));
        
    }
    
}
