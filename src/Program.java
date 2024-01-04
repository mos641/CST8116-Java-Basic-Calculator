/*
 * Assessment: Assignment 03
 * Description: Main method for program
 */

public class Program {

	//main method
	public static void main(String[] args) {
		//setting objects
		MathMachine math = new MathMachine();
		MenuSystem menu = new MenuSystem();
		UserInput user = new UserInput();
		
		//declaring and initializing variable for loop condition and menu choice
		int choice;
		
		//begin loop for continued use of program
		do {
			
			//print menu, testing and storing input for switch
			System.out.println(menu.optionsList());
			choice = user.input(1, 8);
			
			//switch case for menu
			switch(choice) {
			case 1:
				//set values
				System.out.print("Enter left operand value: ");
				math.setLeftOperand(user.input(-1000.0, 1000.0));
				System.out.print("Enter right operand value: ");
				math.setRightOperand(user.input(-1000.0, 1000.0));
				break;
			case 2:
				//display values
				System.out.println("Left Operand: " +math.getLeftOperand()+ ", Right Operand: " +math.getRightOperand());
				break;	
			case 3:
				//add
				System.out.println(math.getLeftOperand()+ " + " +math.getRightOperand()+ " is " +math.add());
				break;
			case 4:
				//subtract
				System.out.println(math.getLeftOperand()+ " - " +math.getRightOperand()+ " is " +math.subtract() );
				break;
			case 5:
				//multiply
				System.out.println(math.getLeftOperand()+ " * " +math.getRightOperand()+ " is " +math.multiply() );
				break;	
			case 6:
				//divide
				System.out.println(math.getLeftOperand()+ " / " +math.getRightOperand()+ " is " +math.divide() );
				break;
			case 7:
				//remainder
				System.out.println(math.getLeftOperand()+ " MOD " +math.getRightOperand()+ " is " +math.remainder() );
				break;
			case 8:
				//do nothing
				break;
			}
			
			//while variable cont is true, continue looping
		}while(choice != 8);
		
		//print thank you message
		System.out.println("Thanks for using the program");
		System.out.println("Program by junior engineer - modified by Mostapha Abdelaziz");

	}

}
