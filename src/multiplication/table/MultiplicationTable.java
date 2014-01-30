/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication.table;

/**
 *
 * @author Admin
 */
public class MultiplicationTable 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int rows = 10;
        int cols = 10;
        for ( int i = 1; i <= rows; i++ )
        {
            for ( int j = 1; j <= cols; j++ )
                System.out.print( "\t" + i * j );
            
            System.out.println();
        }
    }
}
