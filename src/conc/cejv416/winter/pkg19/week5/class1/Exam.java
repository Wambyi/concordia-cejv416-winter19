/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week5.class1;

/**
 *
 * @author gl_dani
 */
public class Exam {
    //attributes
    private double examScore1 = 0.0;
    private double examScore2 = 0.0;
    private double examScore3 = 0.0;
    
    //default constructor - it has to be public
    public Exam (){  
    }
    
    // you can create many constructors
    public Exam (double  score1, double  score2, double  score3)
    {
    examScore1 = score1;
    examScore2 = score2;
    examScore3 = score3;
    }
    
    //method
    public double getAverage ()
    {
        double average;
        average = (examScore1 + examScore2 + examScore3)/3;
        return average;
    }
    
    public boolean isApass ()
    {
        return getAverage() > 60;
    }
    
    //method overloading
    public boolean isApass (double passingValue)
    {
        return getAverage() > passingValue;
    }
    
    
}
