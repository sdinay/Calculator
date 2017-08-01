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

		//while(true) {
			println("Let's begin! Type a short equation with a plus sign in between");
			
			// Scanner Variable
			Scanner sc = new Scanner(System.in);
			input = sc.nextLine();
			if( input == "quit") {
				println("Hello");
			}
			println(input);

		//}
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
	}

}