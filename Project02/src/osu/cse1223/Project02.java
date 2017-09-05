/*
 * Project02.java
 * Takes a string input and does alot of substrings with the string the user inputted
 * 
 * @author Paul M Onderisin
 * @verison 1.0.0
 * 
 * EXTRA CREDIT
 * When i took the index of the long string to find the substring, nothing was found.
 * So it assigned a value of -1 to my index var.
 * So when i tried to find the chars between 0 and -1 it throws an error
 * because that is impossible. it had to be a number between 0 and the length of the main string.
 * 
 * In my code line 55 throws the error, I could create an if statement to check if the substring exists.
 * If it does exists then continue the program if not, stops the program.
 */

package osu.cse1223;

import java.util.Scanner;

public class Project02 {

	public static void main(String[] args) {
		
		//Creates a Scanner varible
		Scanner scan = new Scanner(System.in);
		
		//Prompt a long string for the user to enter
		print("Enter a long string: ", 1);
		
		//Reads the users input and places it into the varible
		String _longString = scan.nextLine();
		
		//prompt a substring to look for
		print("Enter a substring: ", 1);
		
		//Reads the users input and places it into the varible
		String _subString = scan.nextLine();
		
		//Length of the string
		print("Length of your string: " + _longString.length(),0);
		
		//Length of the substring
		print("Length of your substring: " + _subString.length(),0);
		
		//Starting & Ending position of the substring
		int _startingSubStringPos = _longString.indexOf(_subString);
		int _endingSubStringPos = _startingSubStringPos + _subString.length();
		
		//Strating position of the substring
		print("Starting position of your substring in string: " + _startingSubStringPos,0);
		
		//String before the substring
		print(_longString.substring(0, _startingSubStringPos), 0);
		
		//String before the substring
		print(_longString.substring(_endingSubStringPos, _longString.length()), 0);
		
		//Prompts a user for a number in between 0 and length of the _longString
		print("Enter a position between 0 and " + (_longString.length()-1) + ": ", 1);
		
		//Read int that user inputted
		int _charPos = scan.nextInt();
		scan.nextLine();
		
		//tells what char is at the Pos. the user selected
		print("The character at position " + _charPos + " is " + _longString.charAt(_charPos),0);
		
		//Enter a replacement string to replace the substring you have chosen
		print("Enter a replacement string: ", 1);
		
		//Gets the replacement substring
		String _replacementSubString = scan.nextLine();
		
		//replaces the longstring substring with the new one
		print("Your new string is: " + _longString.replace(_subString, _replacementSubString), 0);
		
		//Closes the Scanner
		scan.close();

	}
	
	//I Dont like to type "System.out.println" alot, the int will decide if the dispay well enter a new line or not
	public static void print(String s, int i){
		
		//If i is 0 well print and add a new line
		switch(i){
		default:
			System.out.println(s);
			break;
			
		//if 1 is the int then no new line well be added
		case 1:
			System.out.print(s);
			break;
		}
	}

}
