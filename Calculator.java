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
					println("PLUS");
				} else if (a == '-') {
					println("MINUS");
				} else if (a == ' ') {
					println("SPACE");
				} else if (a >= 48 || a <= 57) {
					println("NUMBER");
				}
			}
		}
	}

	// ============= Useful Functions ============= //
	static void println(Object a) {
    	System.out.println(a);
	}

	static void print(Object a) {
		System.out.print(a);
	}

	// ============ One Time Functions ============= //
	static void printGreeting() {
		print("++++++++++++++++++++++++++++++++++");
		println("++++++++++++++++++++++++++++++++");
		println("+ \t\t\t\t\t\t\t\t +");
		println("+ \t\t Welcome to the Java Calculator \t\t +");
		println("+ \t\t \u0020\u0020\u0020\u0020Created: 07 - 31 - 2017 \t\t\t +");
		println("+ \t\t \u0020\u0020\u0020\u0020Updated: 07 - 31 - 2017 \t\t\t +");
		println("+ \t\t\t\t\t\t\t\t +");
		print("++++++++++++++++++++++++++++++++++");
		println("++++++++++++++++++++++++++++++++");
		println("Type a short addition equation with a plus sign in between");
	}

	static void printHelpInformation() {
		println("Help method does not work yet, sorry");
	}

}