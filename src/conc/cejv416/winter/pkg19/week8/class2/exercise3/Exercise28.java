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
//import java.text.DateFormat;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Exercise28 {
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        GregorianCalendar birthday = new GregorianCalendar ();
        GregorianCalendar today = new GregorianCalendar ();
        
        System.out.println("Welcome to the age calculator!");
        System.out.print("Enter birth year: ");
        birthday.set(Calendar.YEAR, sc.nextInt());
        
        System.out.print("Enter birth month: ");
        birthday.set(Calendar.MONTH, sc.nextInt()-1);
        
        System.out.print("Enter birth day: ");
        birthday.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        
        System.out.println("Current date " + today.getTime().toString() );
        
        int todaysYear = today.get(Calendar.YEAR);
        int todaysMonth = today.get(Calendar.MONTH);
        int todaysDay = today.get(Calendar.DAY_OF_MONTH);
        
        int birthYear = birthday.get(Calendar.YEAR);
        int birthMonth = birthday.get(Calendar.MONTH);
        int birthDay = birthday.get(Calendar.DAY_OF_MONTH);
        
        int age = todaysYear - birthYear;
        if (todaysMonth < birthMonth){
            age = -1;
        }
        if (todaysMonth == birthMonth && todaysDay < birthDay){
            age-= 1;
        }   
        
        Date birthDate = birthday.getTime();
        
        System.out.println("Your birth date " + birthDate.toString());
        System.out.println("Your age " + age);
        
        //System.out.println(birthday.getTime().toString());           //another way to calculate age
        //System.out.println(birthday.getTime().getTime());     //in milliseconds
        
    }
    
}
