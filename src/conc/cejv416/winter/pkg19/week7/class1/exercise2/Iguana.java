/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week7.class1.exercise2;

/**
 *
 * @author gl_dani
 */
public class Iguana extends Animal implements IAnimal{
    
    public void eat(){
        System.out.println("I eat some bugs");
    }
    
    public void run(){
        System.out.println("I am really fast  ");
    }
    
    public char getAnimalType (){
        return REPTILE;   // coming from the interface;
    }
    
}
