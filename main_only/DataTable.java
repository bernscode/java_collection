/*DataTable.java    Author: bernblend
Creates a class that stores the number of lines allowed in a data table,
including the header, and prints the numbers (from 1 to size-1) for each
line, the number squared and the square root of the number. Format the 
table into right-justified columns and round the square root to 6 places 
after the decimal point.
*/

import java.util.Scanner;

public class DataTable
{
    int entries;        // Size field for # of lines in the data table.
   
    public DataTable(int size)  // Constructor that takes the size parameter.
    {
        entries = size;
    }
    
    public void setEntries(int size)   // Set method to change the size.
    {
        entries = size;
    }
    
    public int getEntries()
    {
        return entries;
    }
    
    public void report()      // Report generator for the current size table.
    {
        int i = 0;
        System.out.println();                                  // Header line.
        System.out.println("Number   Squared   Square Root");
        while (++i <= entries)
        {
            System.out.printf("%6d  %7d  %11.6f%n", i, i*i, Math.sqrt(i));
        }
        System.out.println();    // Extra blank line.
    }
    
    public static void main(String[] args)   // Main method demonstrates class.
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Length (as integer) of data table? ");
        int length = scan.nextInt();
        DataTable dt = new DataTable(length);
        dt.report();
    }
}
