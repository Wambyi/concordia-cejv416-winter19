/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week5.class2;

/**
 *
 * @author gl_dani
 */
public class Book {
    private String name = " ";
    private int edition = 0;
    private int pages = 0;
    
    public Book (){} // default constructor
    
    //useful constructor
    public Book (String name, Integer edition, Integer pages){
        this.name = name;  
        this.edition = edition;
        this.pages = pages;    
    }
    
    //obtained by selecting alt + insert
    public int getEdition() {
        return edition;
    }
    public int getPages() {
        return pages;
    }
    
    //getter - has to be public (allow user to get name)
    public String getName(){
        return this.name;
    }
    //setter
    public void setName (String name){
        this.name = name;
    }
    
    //method
    public String getBookInformation(){
        return "Name: " + this.name + ", Ed: " + this.edition + ", pages: " + this.pages;    
    }
    
    public double getBookCopyPrice(int numCopies){
        return (double) this.pages * 0.01 * numCopies;  
    }
}
