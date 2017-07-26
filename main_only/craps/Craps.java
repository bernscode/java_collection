/*Craps.java     Author: bErNbLeNd
Craps class simulates the dice game craps.*/
import java.util.Random;

public class Craps
{
   //Create random number generator for use in method rollDice
   public static final Random randomNumbers = new Random();

   //Enumeration with constants that represent the game status
   private enum Status { CONTINUE, WON, LOST }; //NOTE: the braces here.

   //Constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_ELEVEN = 11;
   private static final int BOX_CARS = 12;
   
   //Plays one game of craps
   public static void main( String[] args )
   {
      int myPoint = 0; //Point if no win or loss on first roll
      Status gameStatus; //Can contain CONTINUE, WON, or LOST

      int sumOfDice = rollDice(); //First roll of dice

      //Determine game status and point based on first roll
      switch( sumOfDice )
      {
         case SEVEN: //Win with 7 on first roll
         case YO_ELEVEN: //Win with eleven on first roll
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: //Lose with 2 on first roll
         case TREY: //Lose with 3 on first roll
         case BOX_CARS: //Lose with 12 on first roll
            gameStatus = Status.LOST;
            break;
         default: //Did not win or lose, so remember point
            gameStatus = Status.CONTINUE; //Game is not over
            myPoint = sumOfDice; //Remember the point
            System.out.printf( "Point is %d\n", myPoint );
            break; //Optional at end of switch
      } //end switch

      //While game is not complete
      while( gameStatus == Status.CONTINUE ) //not WON or LOST
      {
         sumOfDice = rollDice(); //Roll dice again

         //Determine game status
         if ( sumOfDice == myPoint ) //Win by making point
            gameStatus = Status.WON;

         else
            if( sumOfDice == SEVEN ) //Lose by rolling seven before point
               gameStatus = Status.LOST;
      } //End file

      //Display won or lost message
      if( gameStatus == Status.WON )
         System.out.println( "Player wins" );
      else
         System.out.println( "Player loses" );
   } //End main

   //Roll dice, calculate sum and display results
   public static int rollDice()
   {
      //Pick random die values.
      int die1 = 1 + randomNumbers.nextInt( 6 ); //First die roll
      int die2 = 1 + randomNumbers.nextInt( 6 ); //Second die roll

      int sum = die1 + die2; //Sum of die values

      //Display results of this roll
      System.out.printf( "Player rolled %d + %d = %d\n",
         die1, die2, sum );

      return sum; //Return sum of dice
   } //End method of roll dice
} //End class Craps
