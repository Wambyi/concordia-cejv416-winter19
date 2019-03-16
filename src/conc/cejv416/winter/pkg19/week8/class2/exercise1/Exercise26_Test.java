/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week8.class2.exercise1;

//import static conc.cejv416.winter.pkg19.week7.class2.exercise2.ArrayTest.formatArray;

import java.util.ArrayList;

/**     EXERCISE 26
 *
 * @author gl_dani
 */
public class Exercise26_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int LIST_SIZE = 10;
        ArrayList<Integer> myList = new ArrayList<>();
        
        //generate random numbers
        for (int i = 0; i<LIST_SIZE; i++){
            myList.add ((int)(Math.random()*10 + 1)); 
        } 
        
        System.out.println(formatArray(myList));    //array list
        System.out.println("Sum of array list: " + sumArray(myList));   //sum of array list
        System.out.println("Largest number: " + maxArray(myList));   // max
        
        ArrayList<Integer> newArray = shiftArray(myList);
        System.out.println(formatArray(newArray));   // shift
        
    }
    
    //display array/printing
    public static String formatArray(ArrayList<Integer> inputArray){ 
        StringBuilder sb = new StringBuilder();     //concatenate strings
        for (int value: inputArray){
            sb.append(value);
            sb.append(", ");
        }
        return sb.toString();
    }
  
    //calculate the sum
    public static int sumArray(ArrayList<Integer> inputArray){
        int counterSum = 0;
        for (int i: inputArray){
            counterSum += i;  
        }
        return counterSum; 
    }

    // find the maximun
    public static int maxArray(ArrayList<Integer> inputArray){
        int largest = inputArray.get(0);
        
        for (int i : inputArray) {
            if (i > largest){
                largest = i;
            }
        }
        return largest;
    }
    
        // shift array
    public static ArrayList<Integer> shiftArray(ArrayList<Integer> inputArray){
       
        int firstValue = inputArray.get(0);
        inputArray.remove(0);
        inputArray.add(firstValue);

// OR
//          inputArray.add(inputArray.get(0));  -- still need to remove
          
        return inputArray;
    }
    
}
