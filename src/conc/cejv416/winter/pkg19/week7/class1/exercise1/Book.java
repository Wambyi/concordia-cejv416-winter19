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
    
    // ------------ modified code starts here
    public String toString(){
        return "ISBN = " + this.ISBN + ", Name = " + this.name;
        //return super.toString();
    }
    
    // lecture 11, p 15-16
//    public boolean equals(Object obj){
//        if (obj instanceof Book)
//        {
//            Book b2 = (Book) obj;
//            if (b2.name.equals(this.name) && b2.ISBN == this.ISBN){
//                return true;
//            }            
//        }
//            return false;
//        //return super.equals(obj);
//    }
    
    // lecture 11, p 15-16
    
    public boolean equals(Object obj){
        if (obj instanceof Book)
        {
            Book b2 = (Book) obj;
            if (b2.getName().equals(this.name) && b2.getISBN() == this.ISBN){
                return true;
            }            
        }
            return false;
        //return super.equals(obj);
    }
    
}
