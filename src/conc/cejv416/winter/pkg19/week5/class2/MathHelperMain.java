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
public class MathHelperMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myNum = 100;
        
        if (MathHelper.isLarge(myNum))
        {
            System.out.println("The number is considered to be large");
        }
        
        // MathHelper.getLargeNum(); - non static method can't be accessed here
        
        MathHelper m1 = new MathHelper();
        System.out.println(m1.getLargeNum());  // static value can be accessed here (after class instantiation)
    }
    
}
