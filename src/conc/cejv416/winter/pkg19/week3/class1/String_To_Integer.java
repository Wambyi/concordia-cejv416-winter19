/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week3.class1;

/**Parsing: 
 * This code is used to convert string to integer/double
 * @author gl_dani
 */
public class String_To_Integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
            {
                System.out.println("FILE OPENED");
                String StringValue = "2x";
                int x = 7/0;
                int myNumber = Integer.parseInt(StringValue);
                System.out.println(myNumber);
    
            }
        catch (NumberFormatException myExceptionDetails) 
            {
                System.out.println("The value can not be parsed!");
            }
        catch (Exception myExceptionDetails) 
            {
                System.out.println("General error occurred!");
                System.out.println("Here is what happened");
                System.out.println(myExceptionDetails.getMessage());
            }
        
        finally 
        {
            System.out.println("FILE CLOSED");  // closes file (VIP)
            
        }
        
        System.out.println("Add Slash \\in this \'Hey\'");  //print quotation

    }
    
}
