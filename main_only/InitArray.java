//Author: bernblend
//Initializing two-dimentional arrays.

public class InitArray
{
    //Create and output two-dimentional arrays.
    public static void main( String [] args )
    {
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 = {{1,2},{3},{4,5,6}};
        
        System.out.println( "Values in array1 by row are" );
        outputArray( array1 ); //Displays array1 by row.
        
        System.out.println("Values in array2 by row are" );
        outputArray( array2 ); //Displays array2 by row.
    } //End main
    
    //Output rows and columns of a two-dimentional array
    public static void outputArray( int[][] array )
    {
        //Loop through array's rows.
        for( int row = 0; row < array.length; row++ )
        {
            //Loop through columns of current row.
            for ( int column = 0; column < array[ row ].length; column++ )
                System.out.printf( "%d  ", array[ row ][ column ] );
                
            System.out.println();   //Start new line of output.    
        }    //End outer for.
    }    //End method outputArray

}    //End class InitArray
