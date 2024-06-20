/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
 */
package assignment4;
//Imported JOption to use Input in program.
import javax.swing.JOptionPane;
/**
 *
 * @author John Hernandez 06/09/24
 */

public class Assignment4 
{
    public static void main(String[] args) 
    {
        //Declaring Variables
        int hours;
        int speed;
        int distance;
        String str;
        
        //Input using JOption
        str = JOptionPane.showInputDialog("How fast you going in Miles Per Gallon(MPG)");
        speed = Integer.parseInt(str);
        
        //User Input for loop limit
        str = JOptionPane.showInputDialog("How many hours have you traveled?");
        hours = Integer.parseInt(str);
       
        
        //String formating using the \t
        System.out.println("Hours\t\tDistance Traveled");
        System.out.println("----------------------------------");
        
        //using for loop to control the limit of hours 
        for(int i = 1; i <= hours; i++ )
        {
            
            //Calculation to update distance in loop
            distance = speed*i;
            
            //Input Validation for both speed and time traveled
            if(speed>=0)
            {
                if(hours>=1)
                {
                    // i will Inclement by 1 and adjust distance formula 
                    // too a new distance in the next loop around
                    System.out.println(i + "\t\t" + distance);
                }
            }
            
        }
        
    }
    
}
