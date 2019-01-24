/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week2.class1.Task1;

/**
 *
 * @author gl_dani
 */
public class AdditionTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creating an object from the class 'Adder'
        Adder a = new Adder();       
        
        //variable assignement
        a.num1 = 10;   
        a.num2 = 20;
        
        // call method add (displays the values to be added)
        a.add(); 
    }
    
}
