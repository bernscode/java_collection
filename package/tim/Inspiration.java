/********************************************************** THE INSPIRATION MACHINE (VERSION 1.0):      POWERED BY CHOICE & CHANCE ***************************************************************  original from bErNbLeNd  *************************************************************************************************************


        The Inspiration Machine (Version 1.0)



*** CHOICE because you ENTER A NUMBER: (1 to 35).
*** CHANCE because it depends at what time you press SUBMIT.

     enjoy!


     -bErN

*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Inspiration
{
   private int theNum;

   public Inspiration(int num)
   {
      theNum=num;
   }

   public void setTheNum(int num)
   {
      theNum=num;
   }

   public int getTheNum()
   {
      return theNum;
   }





   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print ( "Pick a number from 1 to 35: " );

      int theNum = keyboard.nextInt();

      Inspiration i = new Inspiration(theNum);

      if (i.isValid( ))
      {

         i.serendipidy();
         i.inspirationMachine();

      }
      else
      {
         System.out.println("Invalid user input!\nPlease enter an integer from 1 to 35.");
      }

   }



   public boolean isValid()
   {

      if(( theNum >= 1 && theNum <= 35 ))
      {
         return true;
      }
      else
      {
         return false;
      }
   }




   public void serendipidy()
   {

      long chance;     //long to work with the System.currentTimeMillis()

      if( getTheNum() < 25 )
      {
       System.out.println("You chose number " + getTheNum() );
       System.out.println(System.currentTimeMillis()+ " is the current time in milliseconds.\n");
       long ten = 10;

         chance = (System.currentTimeMillis() % ten); /* long's calculating */

         int oneChance = toIntExact(chance);

         theNum += oneChance;

       System.out.println(oneChance + " is the last digit of the current time in milliseconds plus your number.");

       System.out.println(theNum + " is NOW your lucky number today." );
      }
      else
      {
       System.out.println(" You chose number " + getTheNum());
       System.out.println(System.currentTimeMillis()+ " is the current time in milliseconds.\n");

         long ten = 10;       /* long type used to work with the System.currentTimeMillis() data  */

         chance = (System.currentTimeMillis() % ten); /* long's calculating*/

         int oneChance = toIntExact(chance);

         theNum += oneChance;

         System.out.println(theNum + " is the last digit of the previous number plus your lucky number.");

         System.out.println(theNum + " is NOW your lucky number today.\n" );

         theNum -= 9;           /* $$$ 9 becaue between the 'current time' and your favorite number, the highest number possible is 29

/*   System.out.println(getTheNum() + " is the previous number minus nine (makes up for the milliseconds used from the current time.)"); */

      }

   }





   public void inspirationMachine() //The Inspiration Machine
   {
      if( getTheNum() <= 5 )
      {
         switch( getTheNum() )
         {
            case 1: System.out.println("\"Intelligence is the ability to avoid doing work, yet getting the work done.\"\n\n-Linus Torvalds");
                break;
            case 2: System.out.println("\"Let us train our minds to desire what the situation demands.\"\n\n-Lucius Annaeus Seneca");
                break;
            case 3: System.out.println("\"There's no reason to have a plan b, because it distracts from plan a.\"\n\n-Will Smith");
                break;
            case 4: System.out.println("\"Action is the real measure of intelligence.\"\n\n-Napoleon Hill");
                break;
            case 5: System.out.println("\"A goal is a dream with a deadline.\"\n\n-Napoleon Hill");
                break;
         }
      }
      else
      {
         if( getTheNum() <= 10 )
         {

            switch( getTheNum() )
            {
               case 6: System.out.println("\"You gravitate to that which you secretly love most.\"\n\n-Funkadelic");
                  break;
               case 7: System.out.println("\"If you do not conquer self, you will be conquered by self.\"\n\n-Napoleon Hill");
                  break;
               case 8: System.out.println("\"Any intelligent fool can make things bigger and more complex... It takes a touch of genius - and a lot of courage to move in the opposite direction.\"\n\n-Albert Einstein.");
                  break;
               case 9: System.out.println("\"What we think, we become.\"\n\n-Buddha");
                  break;
               case 10: System.out.println("\"If we chase perfection, we can catch excellence.\"\n\n-Vince Lombardi");
                  break;
            }

         }
         else
         {
            if( getTheNum() <= 15 )
            {

               switch( getTheNum() )
               {
                  case 11: System.out.println("\"If you spend too much time thinking about a thing, you'll never get it done.\"\n\n-Bruce Lee");
                     break;
                  case 12: System.out.println("\"To hell with circumstances; I create opportunities.\"\n\n-Bruce Lee");
                     break;
                  case 13: System.out.println("\"Not everything that can be counted counts, and not everything that counts can be counted.\"\n\n-Albert Einstein");
                     break;
                  case 14: System.out.println("\"No matter what people tell you, words and ideas can change the world.\"\n\n-Robin Williams");
                     break;
                  case 15: System.out.println("\"The measure of who we are, is what we do with what we have.\"\n\n-Vince Lombardi");
                     break;
               }
            }
            else
            {

               if( getTheNum() <= 20 )
               {
                  switch( getTheNum() )
                  {
                     case 16: System.out.println("\"History repeats itself, so why not be on the winning side.\"\n\n-bernblend");
                        break;
                     case 17: System.out.println("\"The best way out is always through.\"\n\n-Robert Frost");
                        break;
                     case 18: System.out.println("\"Thinking will not overcome fear but action will.\"\n\n-W C Stone");
                        break;
                     case 19: System.out.println("\"Success is achieved and maintained by those who try and keep trying.\"\n\n-W C Stone");
                        break;
                     case 20: System.out.println("\"The present is theirs; the future, for which I really worked, is mine.\"\n\n-Nikola Tesla");
                        break;
                  }
               }
               else
               {
                  if( getTheNum() <= 25 )
                  {
                     switch( getTheNum() )
                     {
                        case 21: System.out.println("\"I can is 100 times more than IQ.\"\n\n-unknown");
                           break;
                        case 22: System.out.println("\"Turn your can't into a can, and your dream into a plan!\"\n\n-Cris Nikolov");
                           break;
                        case 23: System.out.println("\"Sometimes the poorest man leaves his children the richest inheritance.\"\n\n-Ruth E. Renkel");
                           break;
                        case 24: System.out.println("\"Hackers believe that something can always be better, and that nothing is ever complete.\"\n\n-Mark Zuckerberg");
                           break;
                        case 25: System.out.println("\"It's the inspired student that continues to learn on their own.\"\n\n-Neil DeGrasse Tyson");
                           break;
                     }

                  }
                  else
                  {
                     if( getTheNum() <= 30 )
                     {
                        switch( getTheNum() )
                        {
                           case 26: System.out.println("\"Intelligence is the ability to adapt to change.\"\n\n-Stephen Hawking");
                              break;
                           case 27: System.out.println("\"Few are those who see with their own eyes and feel with their own hearts.\"\n\n-Albert Einstein");
                              break;
                           case 28: System.out.println("\"I have so much to do. I hate wasting time.\"\n\n-Stephen Hawking");
                              break;
                           case 29: System.out.println("\"Only one who devotes himself to a cause with his whole strength and soul can be a true master. For this reason mastery demands all of a person.\"\n\n-Albert Einstein");
                              break;
                           case 30: System.out.println("\"Intellectuals solve problems, geniuses prevent them.\"\n\n-Albert Einstein");
                              break;
                        }
                     }
                     else
                     {
                        switch( getTheNum() )
                        {
                           case 31: System.out.println("\"It is strange that only extraordinary people make discoveries, which later appear so easy and simple.\"\n\n-Georg C. Lichtenberg");
                              break;
                           case 32: System.out.println("\"A man who dares to waste one hour of time has not discovered the value of life.\"\n\n-Charles Darwin");
                              break;
                           case 33: System.out.println("\"Nothing in life is to be feared, it is only to be understood. Now is the time to understand more, so that we may fear less.\"\n\n-Marie Curie");
                              break;
                           case 34: System.out.println("\"You cannot teach a man anything; you can only help him discover it in himself.\"\n\n-Galileo");
                              break;
                           case 35: System.out.println("\"Valid criticism does you a favor.\"\n\n-Carl Sagan");
                              break;
                        }

                     }
                  }
               }
            }
         }
      }

   }//End of The Inspiration Machine.




/**********************************************************  INSPIRATION MACHINE: POWERED BY CHOICE & CHANCE ***************************************************************  original from bErNbLeNd  *************************************************************************************************************


The Inspiration Machine


*** CHOICE because you ENTER A NUMBER: (1 to 35).
*** CHANCE because it depends at what time you press SUBMIT.

     enjoy!


     -bErN


*/



}
