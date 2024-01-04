/*
 * Assessment: Assignment 03
 * Description: Class for taking user input and validating
 */

import java.util.Scanner;

public class UserInput {
	private Scanner keyboard = new Scanner(System.in);
	
	// class for taking user integer values
	public int input(int minValue, int maxValue) {
		
		int userInput = maxValue + 1;
		
		//ensure value is within range
		while (userInput == maxValue + 1) {
			//check if its an integer
			if(!keyboard.hasNextInt()) {
				keyboard.nextLine();
			} else {
				userInput = keyboard.nextInt();
			}
				
			//check if integer is within range
			if(userInput > maxValue || userInput < minValue) {
				System.out.println("Invalid input. Enter integer numbers from " +minValue+ " to " +maxValue);
				userInput = maxValue + 1;
			} else {
				//nothing
			}
		}
				
		//return the validated integer
		return userInput;
	}
	
	//class for taking double values
	public double input(double minValue, double maxValue) {
		
		double userInput = maxValue + 1;
		//declaring epsilon for comparison of edge cases
		double epsilon = 0.0001;

		//ensure value is within range
		while (userInput == maxValue + 1) {
			//check if its an double
			if(!keyboard.hasNextDouble()) {
				keyboard.nextLine();
			} else {
				userInput = keyboard.nextDouble();
			}
			
			//checking edge cases with epsilon
			if (userInput > minValue && Math.abs(userInput - maxValue) < epsilon) {
				//edge case, do nothing to keep input
			}
			else if (userInput < maxValue && Math.abs(userInput - minValue) < epsilon) {
				//edge case, do nothing to keep input
			}
			//now checking outside normal range
			else if(userInput > maxValue || userInput < minValue ) { 
				System.out.println("Invalid input. Enter decimal numbers from  " +minValue+ " to " +maxValue);
				userInput = maxValue + 1;
			} else {
				//if number is inside normal range, do nothing to keep input
			}
		}
		
		//return the validated double
		return userInput;
	}

}
