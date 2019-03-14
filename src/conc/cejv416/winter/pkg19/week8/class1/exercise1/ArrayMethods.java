/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week8.class1.exercise1;

/**
 *
 * @author gl_dani
 */
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //debug to see it run
        String [] myArray = new String [6];
        Arrays.fill(myArray, myArray.length-3, myArray.length, "*");   
        
        //to make an array list
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Test1");
        myList.add("Test2");
        
        System.out.println(myList.size());
        
        
        
        int x = 0;
    }
    
}
