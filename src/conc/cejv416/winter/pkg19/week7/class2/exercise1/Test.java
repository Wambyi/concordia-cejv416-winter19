/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week7.class2.exercise1;

/**
 *
 * @author gl_dani
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Book[] bookArray = new Book[3];
        
        bookArray[0] = new Book ("The Hobbit", 1234);
        bookArray[1] = new Book ("Lord of the ring", 3982);
        bookArray[2] = new Book ("Trumpy", 4545);
        
        for (Book b: bookArray){
//            System.out.println("Book name is: " + b.getName());
//            System.out.println("ISBN: " + b.getISBN());
            
            // OR
            
            System.out.println(b.toString());
        }
        
    }
    
}
