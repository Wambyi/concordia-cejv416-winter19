/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week2.class1;

/**
 *
 * @author gl_dani
 */
public class Examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5; 
        int y = 1;
        
        y += x; // y = y + 5;
        System.out.println("y = " + y);
         
        x = x + 1;
        x++;
         
        
        int a = 8;
        int b = a++;
        System.out.println("b = " + b);   //b is NOT incremented immediately
        
        int c = ++b;
        System.out.println("c = " + c);  //c is incremented immediately
        
        System.out.println("new b = " + b);  //b is now incremented
        
        double w = 2*2 + Math.pow(2.0, 3.0);
        System.out.println(w);
        
        
        // CASTING
        //int grade = (int) 93.75; // convert double to int (grade = 93)
        //double d = 95.0; 
        //int i = 86, j = 91; 
        // double average = ((int)d+i+j)/3 - not acceptable
        
        //double result = (double) i / (double) j; // result has decimal places
        
        double d = 95.0;
        int i = 86, j = 91;
        double average = ((int)d+i+j)/3; //explicit casting
        System.out.println(average);  //values will be lost
        double result = (double) i / (double) j; // best way to do casting
        //(result = double (i/j)  -- perform operation before making it a double
        
        /******************************AVOID FLOAT*****************************/
        
        // character
        char f1 = 'A';  //ONLY single quotes, double quotes would fail
        System.out.println(f1);  //ascii 65 = A; A is displayed
        f1++;
        System.out.println(f1);
        
        // modolus - can be used to find out if a number is even or not (remainder)
    }
    
}
