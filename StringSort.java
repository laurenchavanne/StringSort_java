// Filename: StringSort.java
// Author: Lauren
// Date: 2/13/19
// Application that allows the user to enter up to 15 Strings and stores them in an array. The user can quit early. The app will then display the strings entered in alphabetical order.

import javax.swing.JOptionPane;
import java.util.Arrays;

public class StringSort
{
	public static void main(String[] args)
	{
		// Variables and constants
		String[] userValues = new String[15];
		int x; // Throw away variable for the loops
		int count = 0;
		String userWord; // Holds onto what the user enters
		final String QUIT = "zzz";
		boolean didUserQuit = false;
		
		// For loop that fills our array with dummy values so the length starts out at the size of the array 
		for(x = 0; x < userValues.length; x++)
		{
			userValues[x] = "zzzz";
		}
		
		// Reset our throwaway variable to zero 
		x = 0;
		
		// While loop that first checks if there is space in the array. While that is true, it will continue 
		while(x < userValues.length)
		{
			userWord = JOptionPane.showInputDialog(null, "Enter a word or type " + QUIT + " to quit now.");
			
			// Decide if the user entered the QUIT command or entered a valid word 
			if(userWord.equalsIgnoreCase(QUIT))
			{
				count = x;
				x = userValues.length;
				didUserQuit = true;
			}
			else
			{
				userValues[x] = userWord;
				x++;
			}
		} // End of while loop which means user quit or we have 15 values at this point
		
		// If the user did NOT quit early, the count variable needs some sort of value. We give it the entire length of the array
		if(!didUserQuit)
		{
			count = userValues.length;
		}
		
		// Sort the array before we output it
		Arrays.sort(userValues);
		String message = "Values: ";
		
		for(x = 0; x < count; x++)
			message = message + "\n " + userValues[x];
		
		JOptionPane.showMessageDialog(null, userValues);
	}
}