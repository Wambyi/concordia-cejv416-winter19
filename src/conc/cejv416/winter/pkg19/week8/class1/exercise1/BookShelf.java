/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week8.class1.exercise1;

import java.util.ArrayList;
/**
 *
 * @author gl_dani
 */
public class BookShelf {
    
    ArrayList <Book> books = new ArrayList<>();  //create an array for class Book
    
    //get size of 'array list'
    public int getSize(){   
        return this.books.size();
    }
    
    //add books for 'array list'
    public void addBook(Book b){
        this.books.add(b);
    }
    
    //remove books
    public void removeBook(Book b){
        this.books.remove(b);
    }
    
    //list books
    public String listBooks(){
        StringBuilder s = new StringBuilder();
        for(Book b: this.books){
            s.append(b.getName() + " " + b.getPages() + "\n");
        }
        return s.toString();
    }
}
