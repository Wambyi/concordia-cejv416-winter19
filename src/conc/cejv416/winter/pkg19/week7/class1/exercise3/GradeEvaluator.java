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
public class GradeEvaluator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StandardGrade sg = new StandardGrade();
        sg.grade = 40;
        
        if (evaluateGrade (sg)){
            System.out.println("The student passed the course.");
        }
        else {
            System.out.println("The student failed the course.");
        }
        
    }
    
    public static boolean evaluateGrade(IGrade g){
        if (g.getGradeValue() > 60){
        return true;
        }
        return false;
    }
    
}
