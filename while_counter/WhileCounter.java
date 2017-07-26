public class WhileCounter
{
    public static void main(String[] args)
    {
       int counter = 1; //declare and initialize control variable

       while (counter <= 10) //loop-continuation condition
       {
          System.out.printf( "%10d ", counter );
          ++counter; //inicrement control variable by 1
       } //end while

       System.out.println(); //out a new line
    } //end main
} //end class WhileCounter
