/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week8.class2.exercise2;

/**
 *
 * @author gl_dani
 */

import java.util.Scanner;

public class Exercise27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String firstName, lastName, fullName;
        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a name: ");
//        fullName = sc.next();
        
        fullName = "   Gladys Daniel    ";
        fullName = fullName.trim();
        
        int indexOfSpace = fullName.indexOf(" ");
        
        firstName = fullName.substring(0, indexOfSpace);
        lastName = fullName.substring(indexOfSpace + 1);
        //lastName = 
        
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
    }
    
}
