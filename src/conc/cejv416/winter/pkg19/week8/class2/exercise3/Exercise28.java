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
import java.text.DateFormat;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Date;

public class Exercise28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Welcome to the age calculator!");
        System.out.print("Month: ");
        int month = sc.nextInt();
        
        System.out.print("Day: ");
        int day= sc.nextInt();
        
        System.out.print("Year: ");
        int year= sc.nextInt();
        
        GregorianCalendar birthday = new GregorianCalendar (year, month-1, day);
        
        Date endDate = birthday.getTime();
        
        DateFormat defaultDate = DateFormat.getDateInstance();
        String currentDateString = defaultDate.format(birthday);
        
        System.out.println("Your birthday is: " + currentDateString );
        System.out.println("Today's date is: ");
        System.out.println("Your age is: ");
        
    }
    
}
