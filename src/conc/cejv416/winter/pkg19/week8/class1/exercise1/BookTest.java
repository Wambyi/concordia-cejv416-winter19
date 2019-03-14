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

import java.util.ArrayList;

public class BookTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create books
        Book b1 = new Book("Java", 201);
        Book b2 = new Book("C++", 524);
        Book b3 = new Book("Embed C", 105);
        
        //initialise bookshelf
        BookShelf bs = new BookShelf();
        
        //add books to bookshelf
        bs.addBook(b1);
        bs.addBook(b2);
        bs.addBook(b3);
        
        //remove book from bookshelf
        bs.removeBook(b2);
        
        //list books
        System.out.println(bs.listBooks());    
        
    }
    
}
