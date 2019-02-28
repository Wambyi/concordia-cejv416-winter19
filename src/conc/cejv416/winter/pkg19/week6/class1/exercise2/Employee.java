/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week6.class1.exercise2;

/**
 *
 * @author gl_dani
 */
public class Employee {
    
    static int lastId = 0;   //static so it can be updated
    
    int id;
    String firstname;
    String Lastname;
    double salary;
    
    // constructor - id omitted
    public Employee(String firstname, String Lastname, double salary) {
        this.firstname = firstname;
        this.Lastname = Lastname;
        this.salary = salary;
        
        //this.id = ++Employee.lastId;  //option 1
        
        //option 2
        this.id = Employee.lastId + 1;   //update id by increment
        Employee.lastId = this.id;
    }
    
    
    
    
    
    
    
}
