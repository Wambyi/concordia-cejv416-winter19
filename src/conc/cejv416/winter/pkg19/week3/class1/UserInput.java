/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week3.class1;

import java.util.Scanner;
/** This code prompts user to enter input
 *
 * @author gl_dani
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double d = sc.nextByte();  
        System.out.println(d);
        
        System.out.print("Enter your name: ");
        String name = sc.next();
        
        System.out.println("Hello, " + name);
    }
    
}
