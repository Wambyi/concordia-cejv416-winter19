/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week9.class1;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author gl_dani
 */
public class bigDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BigDecimal b1 = new BigDecimal("8.05");   
        System.out.println(b1);
        
        BigDecimal b2 = new BigDecimal("10.22");
        System.out.println(b2);
        
        BigDecimal b3 = b2.add(b1);
        System.out.println(b3);
        
        //currency format
        NumberFormat cur = NumberFormat.getCurrencyInstance();
        System.out.println(cur.format(b3));
        
    }
    
}
