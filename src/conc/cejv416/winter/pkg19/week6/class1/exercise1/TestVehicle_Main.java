/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week6.class1.exercise1;

/**
 *
 * @author gl_dani
 */
public class TestVehicle_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c = new Car (false, 50, 2000, "Silver");
        
        Bus b = new Bus (125, 8000, "Yellow");
        
        Truck t = new Truck (true, 200, 15000, "Black");
        
        System.out.println(c.toString());
        System.out.println(b.toString());
        System.out.println(t.toString());
        
        //System.out.print(c.getClass().getSimpleName());
        
        
    }
    
}
