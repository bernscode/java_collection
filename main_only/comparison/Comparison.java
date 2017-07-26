/*Comparison.java   Author: bErNbLeNd
Compare integers using if statements, relational operators
and equality operators.*/
import java.util.Scanner; //program uses class Scanner

public class Comparison
{
   //main method begins execution of Java application
   public static void main(String[] args)
   {
      //Create a Scanner to obtain input from the user
      Scanner input = new Scanner( System.in );

      int num1;   //1st # to compare
      int num2;   //2nd # to compare

      System.out.print( "Enter first integer: " ); //prompt
      num1 = input.nextInt(); //readfirst number from user

      System.out.print( "Enter second integer: " ); //promt
      num2 = input.nextInt(); //read second number from user

      if( num1 == num2 )
         System.out.printf( "%d == %d\n", num1, num2);

      if( num1 != num2 )
         System.out.printf( "%d != %d\n", num1, num2);

      if( num1 < num2 )
         System.out.printf( "%d < %d\n", num1, num2);

      if( num1 > num2 )
         System.out.printf( "%d > %d\n", num1, num2);

      if( num1 <= num2 )
         System.out.printf( "%d <= %d\n", num1, num2);

      if( num1 >= num2 )
         System.out.printf( "%d >= %d\n", num1, num2);
   }//end method main
}//end class Comparison
