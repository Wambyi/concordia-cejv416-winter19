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
public class MathHelper {
    static int large_num = 99999999;
    
    public int getLargeNum()
    {
        return large_num;
    }
    
    static boolean isLarge (int num)  //it can't be private
    {
        if (num > large_num)
        {
            return true;
        }
        return false;
    }
    
}
