/* Class: LeapYear.java
* Author: bErNbLeNd
* Purpose: This program takes a year as user input and determines
if the year entered is a leap year or a regular year.*/
import java.util.Scanner;
public class LeapYear
{
   private int year; // Field for the year.
   public LeapYear() // Constructor sets the year to 2000.
   {
      year = 2000;
   }
   public void setYear(int y) // Set method for the field.
   {
      year = y;
   }
   public int getYear() // Get method for the field.
   {
      return year;
   }
   public void report() // Does the calculations and prints the report.
   {
      if( year < 1752 )
      {
          System.out.println("Regular Year\n");
      }
      else
      {
         if( year%4 != 0 )
         {
            System.out.println("Regular Year\n");
         }
         else
         {
            if( year%100 != 0 )
            {
               System.out.println("Leap Year\n");
            }
            else
            {
               if( year%400 != 0 )
               {
                  System.out.println("Regular Year\n");
               }
               else
               {
                  System.out.println("Leap Year\n");
               }
            }
          }
       }
   }
   public static void main(String[] args) // Start of main method.
   {
   Scanner keyboard = new Scanner(System.in); // Instantiate Scanner.
   int userYear; // Variable to hold user input.
   LeapYear ly = new LeapYear(); // Instantiate LeapYear.
   do
   {
   System.out.print("Enter a year (0 to end)? "); // Prompt user.
   userYear = keyboard.nextInt(); // Get user input.
      if( userYear != 0) // Sentinal-controlled loop.
      {
         ly.setYear(userYear); // Run the setYear method.
         ly.report();  // Run the report method.
      }
   } while( userYear != 0 );
   System.out.print("End of Run\n"); // Advise program has ended.
   } // End of main method.
}
