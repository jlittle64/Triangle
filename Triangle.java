/**
 * This program reads three integers, checks if they form the 
 * sides of a valid triangle, and if they do, reports whether 
 * it is right-angled, equilateral, isosceles,or scalene.
 * 
 * @author (Joshua Little) 
 * @version (February,6 2019)
 */
import java.util.Scanner;
public class Triangle
{
    public static void main (String[] args)
    {
        int side1, side2, side3; // three sides 
        int temp; // used in swap
        char response; // user response to continue or not
        Scanner input = new Scanner (System.in); // to read user input

        // display purpose and author
        System.out.println("This program reads three integers, checks if they form the");
        System.out.println("sides of a valid triangle, and if they do, reports whether");
        System.out.println("it is right-angled, equilateral, isosceles,or scalene.");
        System.out.println ("Author: Joshua Little\tVersion: February 6, 2019");
        System.out.println (); // print blank line

        // see if user wants to run the program 
        System.out.print("Want to run? (enter y to run): ");
        response = input.next().charAt(0);
        System.out.println (); // print blank line

        // process input, if user wishes to continue
        while (response == 'y' || response == 'Y') { 
            // prompt and read three integer sides, one by one 
            System.out.print("Enter an int side1: ");
            side1 = input.nextInt();
            
            System.out.print("Enter an int side2: ");
            side2 = input.nextInt();
            
            System.out.print("Enter an int side3: ");
            side3 = input.nextInt();
            
            // if (side1 > side3) swap them
            if(side1 > side3){
                temp = side3;
                side3 = side1;
                side1 = temp;
                
            }

            // if (side2 > side3) swap them
             if(side2 > side3){
                temp = side3;
                side3 = side2;
                side2 = temp;
                
            }

            // if the simplified triangle condition is met 
            if (side3 < side1 + side2)
                if (Math.pow(side3, 2) == Math.pow(side1, 2) + Math.pow(side2, 2)) {
                    // print valid right-angled triangle 
                    System.out.println("Valid right-angled triangle.");
                }
                else 
                if (side3 == side2 && side3 == side1) {
                    // print valid equilateral triangle 
                    System.out.println("Valid Equilateral triangle.");
                }
                else 
                if (side3 == side2 || side3 == side1 || side2 == side1) {
                    // print valid isosceles triangle 
                    System.out.println("Valid Isosceles triangle.");
                }
                else {
                    // print valid scalene triangle, not right-angled
                    System.out.println("Valid scalene triangle, not right-angled.");
                }
            else {
                // print not a valid triangle 
                System.out.println("Not a valid triangle.");
            }
            System.out.println (); // print blank line

            // see if user wants to tun the program 
            System.out.print("Want to run? (enter y to run): ");
            response = input.next().charAt(0);
            System.out.println (); // print blank line
        }

        // print closing remarks
        System.out.println("Program has terminated. ");
        System.out.println (); // print blank line
    }  
}