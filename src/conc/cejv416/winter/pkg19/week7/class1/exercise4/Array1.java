/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week7.class1.exercise4;

/**
 *
 * @author gl_dani
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] myGrades = {77, 88, 55, 99};
        //System.out.println(myGrades);
        myGrades[2] = 60;  //updates the value
        
        System.out.println("My first grade is " + myGrades [0]);  
       
        for (int i=0; i<myGrades.length; i++){
            System.out.println(myGrades[i]);
        }
        
        for (int a: myGrades){
            System.out.println("My other grade: "  + a);
        }   
    }
    
}
