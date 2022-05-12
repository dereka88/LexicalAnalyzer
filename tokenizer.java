// Lexical Analyzer Program
// Author: Derek Alvarez
package stringTokenizer;

import java.util.Arrays;
import java.util.Scanner;

public class tokenizer {

	
	// Token Codes
	final static int INT_LIT = 10;
	final static int IDENT = 11;
	final static int ASSIGN_OP = 20;
	final static int ADD_OP = 21;
	final static int SUB_OP = 22;
	final static int MULT_OP = 23;
	final static int DIV_OP = 24;
	final static int LEFT_PAREN = 25;
	final static int RIGHT_PAREN = 26;
	static char nextChar;
	
	static int nextToken;
	
	
	public static void main(String[] args) {
	
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter string input, include a space in between each character.");
		
		//Reads string input
		String input = myObj.nextLine();
		
		// String array, each whitespace indicates a split
		String arrOfStr[] = input.split(" ");
		
		// Tokenize string input
		for (String token : arrOfStr)
		{
			/* Alphabetical letters in sequence are  
			 * concatenated to form complete strings */
			int j = 0;
			if (Character.isLetter(token.charAt(j))) { 
				String lexeme = token;
				j++;
				String stringChar = lexeme.concat(token);
			
			// Complete strings indicate that the token data is type IDENTIFIER
			System.out.println("Next token is: IDENT Next lexeme is " +lexeme);
			
			}
			/* This if statement follows the same logic as the previous statement
			 * If a sequence of integers is detected,
			 * concatenate each following integer to indicate a token of type INT_LIT */
			
			if (Character.isDigit(token.charAt(j))) {
				String intLexeme = token;
				j++;
				String stringInt = intLexeme.concat(token);
				System.out.println("Next token is: INT_LIT Next lexeme is " +intLexeme);
				
				
			}
			
			else {
				
				/* Check each index value of the string input to identify its token */
				char[] chars = token.toCharArray();
				Arrays.toString(chars);
				int i=0;
				if (chars[i] == '(') {
					System.out.print("Next token is: LEFT_PAREN Next lexeme is (" + "\n");
					
				/* To print in numeric form:
				 * Add statement: nextToken = LEFT_PAREN;
				 * Modify print statement: ("Next token is: " +nextToken + " Next lexeme is (" )  */
					i++;
				}
				
				else if (chars[i] == ')') {
					System.out.print("Next token is: RIGHT_PAREN Next lexeme is )" + "\n");
					
				/* To print in numeric form:
				 * Add statement: nextToken = RIGHT_PAREN;
				 * Modify print statement: System.out.print("Next token is " +nextToken + "\n"); */
					i++;
				
				}
				
				else if (chars[i] == '-') {
					System.out.print("Next token is: SUB_OP Next lexeme is -" + "\n");
					i++;
				}
				
				else if (chars[i] == '*') {
					System.out.print("Next token is: MULT_OP Next lexeme is *" + "\n");
					i++;
				}
				
				else if (chars[i] == '/') {
					System.out.print("Next token is: DIV_OP Next lexeme is /" + "\n");
					i++;
				}
				
				else if (chars[i] == '+') {
					System.out.print("Next token is: ADD_OP Next lexeme is +" + "\n");
				}
				
				else if (chars[i] == ';') {
					System.out.print("Next token is: SEMICOLON Next lexeme is ;" + "\n");
				}
				
				else if (chars[i] == '=') {
					System.out.print("Next token is: ASSIGN_OP Next lexeme is =" + "\n");
				}
				
				else {
					System.out.print("");
				}
		}
		
		}
		System.out.print("Next token is: END_OF_INPUT Next lexeme is EOI\n"
				+ "Lexical analysis of the program is complete!");

	}

}


