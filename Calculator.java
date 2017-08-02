/*
 * Java Calculator
 * sdinay
 * July 31, 2017
 */

import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		printGreeting();
		
		String input;

		while(true) {
			// Reset Variables
			int resultLength = 101;
			int result[] = new int[resultLength];
			char operations[] = new char[100];
			int iresu = 0;
			int ioper = 0;
			Boolean expressionEntered = false;

			// Scanner Variable
			Scanner sc = new Scanner(System.in);
			input = sc.nextLine();
			
			if(input.equals("quit")) {
				break;
			}

			if(input.equals("help")) {
				printHelpInformation();
			}

			for(int i = 0; i < input.length(); i++) {
				char a = input.charAt(i);
				if (a == '+') {
					operations[ioper] = '+';
					iresu++;
					ioper++;
				} else if (a == '-') {
					operations[ioper] = '-';
					iresu++;
					ioper++;
				} else if (a == ' ') {
					iresu++;
				} else if (a >= 48 || a <= 57) {
					if( !Character.isDigit(a) )
						continue;
					expressionEntered = true;
					if(result[iresu] == 0) {
						result[iresu] = a - '0';
					} else {
						result[iresu] = appendOnesDigit(result[iresu], a-'0');
					}
				} else {
					println("Unknown input");
				}
			}

			int j = 0;
			int k = 0;

			while(j != resultLength-1 && result[j] != 0 && result[j+1] != 0) {
				if(operations[k] == '+') {
					result[j+1] = add(result[j], result[j+1]);
				}
				if(operations[k] == '-') {
					result[j+1] = subt(result[j], result[j+1]);
				}
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

	static int appendOnesDigit(int a, int ones) {
		return (a * 10) + ones;
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int subt(int a, int b) {
		return a - b;
	}

	// ============ One Time Functions ============= //
	static void printGreeting() {
		println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		println("+ \t\t\t\t\t\t\t\t +");
		println("+ \t\t Welcome to the Java Calculator \t\t +");
		println("+ \t\t \u0020\u0020\u0020\u0020Created: 07 - 31 - 2017 \t\t\t +");
		println("+ \t\t \u0020\u0020\u0020\u0020Updated: 07 - 31 - 2017 \t\t\t +");
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