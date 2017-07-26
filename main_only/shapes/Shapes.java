/* Class: Shapes.java
* Author: bErNbLeNd
* Purpose: Solution to Shapes programming lab (skill level JHTP 9e ch3)
* Calculates the perimeters, areas and volumes of shapes given
* measurment from the center to a furthest point of the shape.
* Console I/O with input from the keyboard, output to monitor.
* The radius of the minimum bounding sphere is the same as the
* distance from the center of a square to its corners.
*
* Makes use of static imports (not discussed in class) to skip
* prefixing Math members with the class name (i.e., Math.pow).
*/

import java.util.Scanner;
import static java.lang.Math.*; // To avoid typing Math before members.

public class Shapes
{
   private int radius; // Field for the radius of min bounding sphere.

   public Shapes(int r) // Constructor requires integer for the radius.
   {
      radius=r;
   }

   public void setRadius(int r) // Set method for the field.
   {
      radius=r;
   }

   public int getRadius() // Get method for the field.
   {
      return radius;
   }

   public void report() // Does the calculations and prints the report.
   {
   /* The equations for circles and spheres are very easy to find.
   * Note the static import on line 16 allows me to avoid Math as
   * a prefix to all the constants, methods inside of Math class.
   */
   System.out.println();
   System.out.println("Circle perimeter, area / Sphere volume:");
   System.out.println(" perimeter : " + 2*PI*radius);
   System.out.println(" area : " + PI*pow(radius,2));
   System.out.println(" volume : " + 4./3*PI*pow(radius,3));

   /* Note that the diameter of the bounding sphere (or circle) is
   * the hypotenuse of right-isosceles triangle w/ adjacent sides
   * that are also the sides of the square. Thus, the sides are
   * √((2r)²/2) or sqrt(pow(2*radius,2)/2) in Java.
   */
   System.out.println();
   System.out.println("Square perimeter, area:");
   System.out.println(" perimeter : " + 4*sqrt(pow(2*radius,2)/2));
   System.out.println(" area : " + pow(sqrt(pow(2*radius,2)/2),2));
   System.out.println();
   }


   public static void main(String[] args)
   {
   Scanner keyboard = new Scanner(System.in); // Keyboard → Scanner.
   System.out.print("Radius (as integer) of bounding sphere? ");
   int radius = keyboard.nextInt();

   Shapes s = new Shapes(radius);
   s.report();
   }
}
