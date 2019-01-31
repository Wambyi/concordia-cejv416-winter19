/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week3.class1;
import java.util.Scanner;
/**
 *
 * @author gl_dani
 */
public class Condition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double num =  (int)(Math.random()* 3) + 1;
         
            
        Scanner check = new Scanner (System.in);
        System.out.println("Please enter a number btw 1 and 3: ");
        int myVal = check.nextInt();
        System.out.println("check");
        
        if (myVal > num)
        {
            System.out.println("Too high");
        }
        else 
        {
            System.out.println("Too low");
        }

        System.out.println("The random number was: " + num);

    }
    
}
