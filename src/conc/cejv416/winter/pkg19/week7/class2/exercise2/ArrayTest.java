/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

        EXERCISE 25 (FROM LECTURE)

 */
package conc.cejv416.winter.pkg19.week7.class2.exercise2;

/**
 *
 * @author gl_dani
 */
public class ArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] myList = new int [10];
        
        int sum = 0;
        for (int i = 0; i<myList.length; i++){
            myList[i]= (int)(Math.random()*10 + 1); 
        }
        
        System.out.println(formatArray(myList));
        
        System.out.println("Sum: " + sumArray(myList));
        
        System.out.println(maxArray(myList));   // max
        
        int [] newArray = shiftArray(myList);
        System.out.println(formatArray(newArray));   // shift
        
        
        
    }
    
    public static String formatArray(int [] inputArray){ 
        StringBuilder sb = new StringBuilder();     //concatenate strings
        for (int value: inputArray){
            sb.append(value);
            sb.append(", ");
        }
        return sb.toString();
    }
    
    //calculate the sum
    public static int sumArray(int [] inputArray){
        int sum = 0;
        for (int i: inputArray){
            sum += i;  
        }
        return sum; 
    }
 
    // find the maximun
    public static int maxArray(int[] inputArray){
        int largest = inputArray[0];
        for (int i = 0; i< inputArray.length; i++) {
            if (inputArray[i] > largest){
                largest = inputArray[i];
            }
        }
        return largest;
    }
    
    // shift array
    public static int[] shiftArray(int[] inputArray){
        int firstValue = inputArray[0];
        for (int i = 1; i<inputArray.length; i++){
            inputArray[i-1] = inputArray[i];
        }
        inputArray[inputArray.length-1] = firstValue;     
        return inputArray;
    }
}
