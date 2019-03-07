/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week7.class1.exercise3;

/**
 *
 * @author gl_dani
 */
public class StandardGrade implements IGrade{
    
    double grade;
    
    public double getGradeValue(){
       return grade; 
    }
    
    public String getGradeLetter(){
        if (grade > 90){
           return "A"; 
        }
        if (grade > 80){
           return "B"; 
        }  
        if (grade > 70){
           return "C"; 
        }
        return "F";   
    }
    
}
