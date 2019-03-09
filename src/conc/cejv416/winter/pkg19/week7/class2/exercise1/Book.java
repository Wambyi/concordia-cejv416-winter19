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
public class Book {
    
    private String name;
    private int ISBN;

    public Book(String name, int ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    public String toString(){
        return "ISBN = " + this.ISBN + ", Name = " + this.name;
        //return super.toString();
    }
    
    
}
