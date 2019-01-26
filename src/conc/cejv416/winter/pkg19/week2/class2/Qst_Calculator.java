/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week2.class2;

/** This code is used to calculate the QST and GST, while summing the total
 *
 * @author gl_dani
 */
import java.text.NumberFormat;
import java.util.Locale;


public class Qst_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // paramters needed (Original price,  QST% & GST%)
        double originalPrice = 11.575;
        final double QST = 0.1;      // 'final' means the maximum percentage accepted
        final double GST = 0.05;
        
        //calculate QST, GST and Total price 
        double price_qst = originalPrice * QST;
        double price_gst = originalPrice * GST;
        double total_price = originalPrice + price_qst + price_gst;
               
        // Convert price into local currency format
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        String priceString = currency.format(originalPrice);
        String new_qst = currency.format(price_qst);
        String new_gst = currency.format(price_gst);
        String new_total = currency.format(total_price);
        
        //Convert QST & GST percentage into respective percentage format
        NumberFormat percentage = NumberFormat.getPercentInstance(Locale.CANADA_FRENCH);
        String qstString = percentage.format(QST);
        String gstString = percentage.format(GST);


        System.out.println("Price: " + priceString);
        System.out.println("QST (" + qstString + "):" + new_qst);
        System.out.println("GST (" + gstString + "):" + new_gst);
        System.out.println("Total Price: " + new_total);
        
    }
    
}
