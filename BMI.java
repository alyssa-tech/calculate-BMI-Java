/* purpose : to calculate BMI*/
package LAB3;

import java.util.Scanner;
public class BMI {
	public static void main (String [] args) {
      String name;
      double height, weight, BMI; // declare variables
      Scanner input = new Scanner (System.in);
      
      //read input
      System.out.print ("Enter name = ");
      name = input.next ();
      
      System.out.print ("Enter height (m) = ");
      height = input.nextDouble ();
      
      System.out.print ("Enter weight (kg) = ");
      weight = input.nextDouble ();
      
      //processing statement
      BMI = weight / (height * height);
      
      //display output
      System.out.println ( name + "'s BMI = " + BMI);
     
      
}
}