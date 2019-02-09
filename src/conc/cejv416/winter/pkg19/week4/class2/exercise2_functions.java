/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week4.class2;

/**  This code contains functions or 'methods' that would be called 
 *  The methods include 'printStarts' and 'isEven'
 *
 * @author gl_dani
 */
public class exercise2_functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {  
        //code to call printStars and actually print stars
        printStars(5);
        
        // code to call isEven i.e to check if a value is even or odd
        int x = 100;
        if (isEven(x))
            System.out.println("Value: " + x + " is even");
        else
            System.out.println("Value: " + x + " is odd");
        
        //call method 'getAverage'
        System.out.println(getAverage(10,20));
        System.out.println(getAverage(10,30, 0.12));
    }
    
    public static void printStars(int numberStars)           
    {
        int size = numberStars;
        for (int i = 1; i<=size; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
        
    public static boolean isEven(double check)           
    {   
        return check % 2 == 0;
    }
    
    public static double getAverage(int num1, int num2)           
    {   
        System.out.println("Check 1");
        return (num1 + num2)/2;
    }
    
    public static double getAverage(double num1, double num2, double num3)           
    {   
        System.out.println("Check 2");
        return (num1 + num2 + num3)/3;
    }
    
}
