/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week5.class2;

import java.text.NumberFormat;

/** LAB 17 (refer to slides)
 *
 * @author gl_dani
 */
public class Lab17Main {
    
    public static void main(String[] args) {
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        Lab17Product product1 = new Lab17Product ("Java", "Intro to Java", 10);
        Lab17Product product2 = new Lab17Product ("JSP", "Intro to JavaScript", 20);
        Lab17Product product3 = new Lab17Product ("Andriod", "Intro to Mobile development", 50);
        
        System.out.println("Product 1: ");
        System.out.println("Code: " + product1.getCode());
        System.out.println("Description: " + product1.getDescription());
        System.out.println("Price: " + nf.format(product1.getPrice()));
        
        System.out.println(" ");
        
        System.out.println("Product 2: ");
        System.out.println("Code: " + product2.getCode() + "\tDescription: " + product2.getDescription() + ", Price: " + nf.format(product2.getPrice()));
        
        System.out.println(" ");
        
        System.out.println("Product 3: ");
        System.out.println("Code: " + product3.getCode() + ", Description: " + product3.getDescription() + ", Price: " + nf.format(product3.getPrice()));
        
    }
    
}
