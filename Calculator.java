/*
 * Java Calculator
 * sdinay
 * July 31, 2017
 */

import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		printGreeting();
		
		// Holds the line typed as a string
		String input;
		char[] symbols = {'+', '-', '*', '/', '%'};
		String beforeTheSpace = "nothing";

		while(true) {
			// Reset Variables
			int resultLength = 101; // Amount of numbers the expression can hold
			double[] result = new double[resultLength]; // Initially holds the inputed numbers, then holds the results
			char[] operations = new char[100]; // Holds the operations in order
			int iresu = 0; // Index for result[]
			int ioper = 0; // Index for operations[]
			Boolean expressionEntered = false; // Checks if an expression was entered

			// Scanner Variable
			Scanner sc = new Scanner(System.in);
			print("> ");
			input = sc.nextLine();
			
			// typing quit by itself exits while loop and the program
			if(input.equals("quit")) {
				break;
			}

			// typing help outputs usage information
			if(input.equals("help")) {
				printHelpInformation();
			}

			for(int i = 0; i < input.length(); i++) {
				char a = input.charAt(i); // grab the char
				// addtion, subtraction
				if (a == '+' || a == '-' || a == '*' || a == '/') {
					if(!c_contains(symbols, a)) {
						println("Warning: symbol not present in calculator");
						break;
					}
					operations[ioper] = a;
					iresu++;
					ioper++;
				} 
				//skip the spaces
				else if (a == ' ') {
					println("In here: iresu = " + iresu + " ioper = " + ioper);
					// if it is a number and then another number
					/*if(iresu == ioper) {
						// error
						beforeTheSpace = "number";
					}*/
					// if it is a number and then a symbol
					// good
					// if it is a symbol and then a number
					// good
					// if it is a symbol and then another symbol
					// error
				}
				// number
				else if (a >= 48 || a <= 57) {
					// If a is not a digit, skip the char
					if( !Character.isDigit(a) ) {
						//println("Warning: symbol not present in calculator");
						expressionEntered = false;
						break; //continue;
					}
					expressionEntered = true;
					if(result[iresu] == 0) {
						result[iresu] = a - '0';
					} else {
						result[iresu] = appendOnesDigit(result[iresu], a-'0');
					}
				} else {
					println("Warning: symbol not present in calculator");
				}
			}

			int j = 0; // Tracks the result array
			int k = 0; // Tracks the operations array

			/*println("iresu = " + iresu);
			println("ioper = " + ioper);*/

			// If result index is not bigger than result[] and the elements are not empty
			while(j != resultLength-1 && j < iresu) {//result[j] != 0 && result[j+1] != 0) {
				//println("j = " + j + " and k = " + k);
				if(operations[k] == '+')
					result[j+1] = add(result[j], result[j+1]);
				if(operations[k] == '-')
					result[j+1] = subt(result[j], result[j+1]);
				if(operations[k] == '*')
					result[j+1] = mult(result[j], result[j+1]);
				if(operations[k] == '/')
					result[j+1] = div(result[j], result[j+1]);
				if(operations[k] == '%')
					result[j+1] = modulus(result[j], result[j+1]);
				j++;
				k++;
			}
			if(expressionEntered)
				println("Result: " + result[j]);
		}
	}

	// ============= Useful Functions ============= //
	
	static void println(Object a) {
    	System.out.println(a);
	}

	static void print(Object a) {
		System.out.print(a);
	}

	static boolean c_contains(char[] a, char b) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == b) {
				return true;
			}
		}
		return false;
	}

	// Multiplies a number by 10 and addeds a digit 0-9 to it
	static double appendOnesDigit(double a, double ones) {
		return (a * 10) + ones;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static double subt(double a, double b) {
		return a - b;
	}

	static double mult(double a, double b) {
		return a * b;
	}

	static double div(double a, double b) {
		return a / b;
	}

	static double modulus(double a, double b) {
		return a % b;
	}

	// ============ One Time Functions ============= //

	static void printGreeting() {
		println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		println("+ \t\t\t\t\t\t\t\t +");
		println("+ \t\t Welcome to the Java Calculator \t\t +");
		println("+ \t\t \u0020\u0020\u0020\u0020Created: 07 - 31 - 2017 \t\t\t +");
		println("+ \t\t \u0020\u0020\u0020\u0020Updated: 08 - 09 - 2017 \t\t\t +");
		println("+ \t\t\t\t\t\t\t\t +");
		println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		println("+ \t\t\t\t\t\t\t\t +");
		println("+ \u0020Type an equation using at most 5 numbers seperated by some\u0020\u0020\u0020 +\n+ \u0020plus and/or minus signs\t\t\t\t\t +");
		println("+ \t\t\t\t\t\t\t\t +");
		println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	static void printHelpInformation() {
		println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		println("+ \t\t\t\t\t\t\t\t +");
		println("+ \t\t\t INFORMATION \t\t\t\t +");
		println("+ quit\t:type quit by itself on a line to exit the Calculator \u0020\u0020\u0020+");
		println("+ help\t:type help for information on how to use the Calculator \u0020+");
		println("+ \t\t\t\t\t\t\t\t +");
		println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

}