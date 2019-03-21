/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week9.class1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author gl_dani
 */
public class DateTest2 {

    
    static String months [] = {"Jan", "Feb", "Mar", "Apr", "May",
                        "Jun", "Jul", "Aug", "Sep", "Oct",
                        "Nov", "Dec"};
    
    public static void main(String[] args) {
        
        GregorianCalendar gc = new GregorianCalendar(2018, Calendar.OCTOBER, 10);
        printDate(gc);
        
        gc.set(2019,Calendar.MARCH, 20);
        printDate(gc);
        
        gc.roll(Calendar.MONTH, 4);     //roll
        printDate(gc);
        
        gc.add(Calendar.MONTH, 4);      //add
        printDate(gc);
        
        gc.set(2019,Calendar.MARCH, 16);  
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));  //get day of the week
        
        System.out.println(gc.getActualMaximum(Calendar.DAY_OF_MONTH));   //to know the maximum days of the month
        
       //date format
       Date x = new Date();
       SimpleDateFormat format = new SimpleDateFormat("yyyy-MMMM-dd");
       System.out.println(format.format(x));
    }
    
    private static void printDate(GregorianCalendar gc){
         System.out.println(gc.get(Calendar.YEAR) + "-" 
                 + months[gc.get(Calendar.MONTH)] + "-" 
                 + gc.get(Calendar.DAY_OF_MONTH));
    }
}
