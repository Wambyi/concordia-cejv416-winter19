/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week2.class2;

import java.text.NumberFormat;

/**Precision - This code is used to alter the precision of pi
 *
 * @author gl_dani
 */
public class NumberFormatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double pi = 3.14159;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(1);   //set precision to 1
        
        String my_result = formatter.format(pi);
        System.out.println(my_result);
        
        formatter.setMaximumFractionDigits(3);  //set precision to 3
        my_result = formatter.format(pi);
        System.out.println(my_result);
        
        
    }
    
}
