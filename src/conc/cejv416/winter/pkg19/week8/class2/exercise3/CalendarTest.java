/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week8.class2.exercise3;

/**
 *
 * @author gl_dani
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Date;


public class CalendarTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //parameters needed: year, month, day
       
       GregorianCalendar birthday = new     GregorianCalendar(2000, 0, 14);      // January 1, 2010 
        
        GregorianCalendar endDate = new     GregorianCalendar(2010, 0, 1);      // January 1, 2010 
        endDate.set(2010, 2, 30);              
        endDate.set(2010, Calendar.MARCH, 30); 
        endDate.set(Calendar.MONTH, Calendar.JANUARY);                                        
        endDate.add(Calendar.MONTH, 5);        
        endDate.add(Calendar.MONTH, 14);       // August 30, 2011 
        endDate.roll(Calendar.MONTH, 14);      // October 30, 2011 
        endDate.roll(Calendar.MONTH, true);    // November 30, 2011 
        endDate.roll(Calendar.DAY_OF_MONTH, false);   // November 29, 2011
        
        System.out.println(birthday.getTime());
        
        Date currentDate = new Date();
        System.out.println(currentDate.toString());
        System.out.println(currentDate.getTime());
        
    }
    
}
