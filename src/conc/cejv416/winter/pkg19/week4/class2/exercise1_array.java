/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week4.class2;

/** This project will make an array using for-loops 
 *
 * @author gl_dani
 */
public class exercise1_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        for (int i=2; i <=10 ; i+=2)
        {  
            System.out.print(i + " ");
        }  
        System.out.println(" ");
        
        for (int i=9; i >=5 ; i--)
        {  
            System.out.print(i + " ");
        }
        System.out.println(" ");
        
        for (int i=8; i >= 0 ; i-=2)
        {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        
        for (int i=1; i <=6 ; i++)
        {
            System.out.print((int)Math.pow(2,i) + " ");
        }
        System.out.println(" ");
               
    }
    
}
