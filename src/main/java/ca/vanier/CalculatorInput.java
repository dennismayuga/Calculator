package ca.vanier;


import java.util.Scanner;

public class CalculatorInput {

	/*
	 *  This input class containts multiple scanners that accept SUM NUM1 and NUM2.
	 * 	all inputs are run through checks to ensure they are valid and surrounded by
	 * 	while loops if any input is not valid. The program only continues if the input is valid
	 * 	and a invalid error message is displayed every time input is invalid.
	 * 	Once input is valid it is put into a new object and sent to the response class.
	 * 
	 * 
	 */
	
	public static void run(){
		/*
		 * This program works by 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Type one of the following calculation options: " + '\n' + "-Sum" + '\n' + "-Subtract"
				+ '\n' + "-Divide" + '\n' + "-Multiply");
		System.out.println("----------------------------------------");

		String operation = "";
		while(true) {
		operation = scan.nextLine();
		
		if(CalculatorResponse.check(operation)==true) {
		break;
		}
		else {
		System.out.println("ERROR! Invalid operation input, please try again :) ");
		System.out.println("Remember please use one of the following calculation options: " + '\n' + "-Sum" + '\n' + "-Subtract"
				+ '\n' + "-Divide" + '\n' + "-Multiply");
		}
		}
		
		

		System.out.println("Please enter your first Number...");

		double num1 = 0;
		String temp1 = "";
		while (true) {
			temp1 = scan.nextLine();
			try {
				num1 = Double.parseDouble(temp1);
				break;
			} catch (Exception e) {
				System.out.println("ERROR! That is not a number, please try again :)");
				System.out.println("Log: "+e.getMessage());
			}
		}
		System.out.println("Please enter your second Number...");

		double num2 = 0;
		String temp2 = "";
		while (true) {
			temp2 = scan.nextLine();
			try {
				num2 = Double.parseDouble(temp2);
				break;
			} catch (Exception e) {
				System.out.println("ERROR! That is not a number, please try again :)");
				System.out.println("Log: "+e.getMessage());
			}
		}
		scan.close();

		// Running CalculatorResponse
		CalculatorResponse run = new CalculatorResponse(operation, num1, num2);
		run.driver();
		
	
	}

}
