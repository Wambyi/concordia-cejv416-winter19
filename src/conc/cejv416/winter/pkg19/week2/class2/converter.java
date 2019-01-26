/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week2.class2;

/**This program is used to convert Celcius to Fahrenheit and vice-versa;
 *
 * @author gl_dani
 */
public class converter {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Celcuis to Fahrenheit
        float f = ((float)9/5)* (float)0 + 32;  //--float in bracket is called casting (improve accuracy)
        System.out.println("Fahrenheit = " + f);
        
        f = ((float)9/5)* (float)10 + 32;
        System.out.println("Fahrenheit = " + f);
        
        f = ((float)9/5)* (float)15 + 32;
        System.out.println("Fahrenheit = " + f);
        
        //Fahrenheit to celcuis
        float c = ((float)68 - 32)/((float)9/5);
        System.out.println("Celcuis = " + c);
        
        c = ((float)86 - 32)/((float)9/5);
        System.out.println("Celcuis = " + c);
        
        float in_temp = 104;
        c = (in_temp - 32)/((float)9/5);
        System.out.println("Celcuis = " + c);
        
        float d = (104 - 32)/((float)9/5);
        System.out.println("Celcuis = " + d);
        
        
    }
    
}
