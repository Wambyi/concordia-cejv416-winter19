/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week4.class2;

/** Break-and-continue (Break loop and then continue programming)
 *
 * @author gl_dani
 */
public class breakandcontinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 0;        
        while (n<=10)
        {
            n++;
            
            if (n==5)
            {
                System.out.println("Watch it!");
                break;    //can be replaced with a break to cut-off the loop
            }
            System.out.println(n);        
        }
        
        
        for (int i = 1; i <= 5; i++)
        {   
            for (int j = 1; j <= i; j++)
            {     
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();
        }
        
        //System.out.println(" ");
        
        //int size = 6;
        
//        for (int i = 1; i <= size; i++)
//        {   
//            size--;
//            
//            for (int j = 1; j <=(2*i-1); j++)
//            {
//                System.out.print(" ");
//                System.out.print("*");
//                System.out.print(" ");
//                
//            }
//            
//            System.out.println(" ");
        //}
            
        
    }
    
}
