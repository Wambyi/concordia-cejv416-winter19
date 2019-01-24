/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week2.class1;

/**
 *
 * @author gl_dani
 */
public class ClassTest1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Person p1 = new Person();  //class'Person' is defined in the same package
       Person p2 = new Person();
       
       p1.name = "Daniel";  //
       p1.age = 20;
       
       p2.name = "Bob";
       p2.age = 15;
       
       System.out.println("Name\t" + p1.name + "\n" + "Age\t" + p1.age); 
       System.out.println("Age of both is " + (p1.age + p2.age));
       
       p2.sayAge();  //calling a method
       
    }
    
}
