/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week5.class1;

/**
 *
 * @author gl_dani
 */
public class exercise2_max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Max = " + max(100, 200, 900));
        
        System.out.println(exercise2_max.getSum(1,4));
    }
    
    public static int max(int num1, int num2, int num3) {
        int largest = num1;
        if (num2 > largest)
        {
            return num2;
        }
        if(num3 > largest)
        {
            return num3;
        }
        return largest;
    }
    
    public static int getSum(int num1, int num2) {
        return (num1 + num2);
    }
    
}
