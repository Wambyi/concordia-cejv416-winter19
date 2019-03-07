/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week7.class1.exercise1;

/**
 *
 * @author gl_dani
 */
public class BookTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = new Book ("Dune", 1234);
        Book book2 = new Book ("Dune", 1234);
        Book book3 = new Book ("The joy of cooking", 2345);
        
        // test 1
        if (book1.equals(book2)){
            System.out.println("Book1 = Book2");
        }
        else {
            System.out.println("Book1 != Book2");
        }
        
        //test 2
        if (book2.equals(book3)){
            System.out.println("Book2 = Book3");
        }
        else {
            System.out.println("Book2 != Book3");
        }
    }
    
}
