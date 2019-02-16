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
public class exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        System.out.println("sum1 = " + sum(1,10));
        
        System.out.println("sum2 = " + sum(20,30)); 
        
        System.out.println("sum3 = " + sum(35,45)); 
        
    }
    
    public static int sum (int start, int end)
    {
        int add = 0;
        for (int i=start; i<=end; i++)
        {
            add+=i;
        }
        return add;

    }
    
}
