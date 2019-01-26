/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week2.class2;

/**
 *
 * @author gl_dani
 */
import java.text.NumberFormat;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double price = 11.76;
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();              
        String priceString = currency.format(price);
        
        System.out.println(priceString);
    }
    
}
