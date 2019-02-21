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
public class bookMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Book book1 = new Book("Star wars Ep 2", 1, 350);
        
        Book book2 = new Book(null, null, 400);  // when you dont know the name of the book, null only works for Strings; would work for 'Integer'
        
        book1.setName ("Zen and the art of motocycle maintenance");
        
        double borrowCost = book1.getBookCopyPrice(10);
        double borrowCostFor10 = book1.getBookCopyPrice(10);
        
        //System.out.println(book1.name);   -- won't work because name is private
        System.out.println(" The name of the book is '" + book1.getName() + "' ");
        
        System.out.println(book1);
        
        // defensive coding - taking highest level of precaution
        // can't be debugged - therefore always initialise values
        Integer abcd; //default is null
        int abc; //default is zero
        boolean isCondition; //default value is false
        
        
    }
    
}
