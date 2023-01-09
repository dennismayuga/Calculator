
package ca.vanier;

public class App {

	/*
	 * Calculator Program
	 * Dennis Mayuga, 2295238
	 * December 14, 2022
	 */
	
	public static void main(String[] args){
		/*
		 * This program works by running the CalculatorInput classes static run method which contains
		 * multiple input scanners and exceptions to ensure the input is correct.
		 * Once input is correct the data is passed through object creation
		 * into the CalculatorResponse class and the data is calculated and displayed
		 * according to the provided operation.
		 */

		CalculatorInput.run();
		
	}
}
