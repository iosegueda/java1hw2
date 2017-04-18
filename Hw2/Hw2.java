//Iris Osegueda

import javax.swing.*;

public class Hw2
{
	public static void main( String[] args )
	{
		int year;
        String message = "";
        final int SENTINEL = -99;

        year = Integer.parseInt(JOptionPane.showInputDialog("Please enter a year to find out whether or not it's a leap year! \nOr enter " + SENTINEL + " to quit. " ));

        while ( year != SENTINEL )
        {
            if ( year % 4 == 0 )
            {
                if ( year % 100 == 0 )
                {
                    if ( year % 400 == 0 )
                    {
                        message = "This year IS a leap year! " ;
                    }
                    else
                    {
                        message = "This year is NOT a leap year." ;
                    }
                }
                else
                {
                    message = "This year IS a leap year! " ;
                }
            }
            else
            {
                message = "This year is NOT a leap year." ;
            }

            JOptionPane.showMessageDialog( null, message );

            year = Integer.parseInt(JOptionPane.showInputDialog("Please enter a year to find out whether or not it's a leap year! \nOr enter " + SENTINEL + " to quit. " ));
        }

        System.exit ( 0 );
    }
}
