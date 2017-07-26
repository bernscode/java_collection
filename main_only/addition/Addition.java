/*Addition.java   Author: bErNbLeNd
Additon program that displays the sum of 2 #'s'.*/
import java.util.Scanner; //program uses class Scanner

public class Addition
{
   //main method begins execution of Java application
   public static void main(String[] args)
   {
      //Create a Scanner to obtain input from the user
      Scanner input = new Scanner( System.in );

      int num1;   //1st # to add
      int num2;   //2nd # to add
      int sum;   //sum of num1 and num2

      System.out.print( "Enter first integer: " ); //prompt
      num1 = input.nextInt(); //readfirst number from user

      System.out.print( "Enter second integer: " ); //promt
      num2 = input.nextInt(); //read second number from user

      sum = num1 + num2; //add numbers, then store total in sum

      System.out.printf( "Sum is %d\n", sum); //displays sum

   }//end method main
}//end class Addition
