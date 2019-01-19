/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week1.class2;

/**
 *
 * @author gl_dani
 */
public class Lab2_Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int currentYear = 2019;
        int birthYear  = 1995;
        int months_in_a_year = 12;
        int days_in_a_year = 365;
        
        int age = currentYear - birthYear;
        
        int monthsLived = age * months_in_a_year;
        int dayslived = age * days_in_a_year;
                
        System.out.println("Age = " + age);
        System.out.println("Months lived on planet earth = " + monthsLived);
        System.out.println("Days = " + dayslived);
        

        
    }
    
}
