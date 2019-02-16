/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week5.class1;

/**
 *
 * @author gl_dani
 */
public class exercise3_Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Exam e1 = new Exam(85, 89, 99);
        
        Exam e2 = new Exam(25, 30, 10);
        
        // double average1 = e1.getAverage();  // to calculate the average
        
        System.out.println("Did the student pass ? " + e1.getAverage());
        
        System.out.println("Did the student pass ? " + e1.isApass());
        
        System.out.println("Did the student pass ? " + e2.isApass());
        
        if (e1.isApass()){
            System.out.println("Exam 1 passed! ");
        }
        else
        {
            System.out.println("Exam 1 failed! ");
        }
        
        if (e2.isApass()){
            System.out.println("Exam 2 passed! ");
        }
        else
        {
            System.out.println("Exam 2 failed! ");
        }
        
        
        
        
        
    }
    
}
