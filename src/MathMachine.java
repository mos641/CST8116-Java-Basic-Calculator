/*
 * Assessment: Assignment 03
 * Description: Class for inputting and calculating users desired math calculations
 */

//public class with the variables for each operand declared
public class MathMachine {
	private double leftOperand = 0;
	private double rightOperand = 0;
	
	//default constructor
	public MathMachine() {
		
	}
	
	//overloaded constructor, input values for operand
	public MathMachine(double leftOperand, double rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	
	//to retrieve value in left operand
	public double getLeftOperand() {
		return leftOperand;
	}
	
	//to set value in left operand
	public void setLeftOperand(double leftOperand) {
		this.leftOperand = leftOperand;
	}
	
	//to get value in right operand
	public double getRightOperand() {
		return rightOperand;
	}
	
	//to set value in right operand
	public void setRightOperand(double rightOperatnd) {
		this.rightOperand = rightOperatnd;
	}
	
	// adding the two values
	public double add() {
		return leftOperand + rightOperand;
	}
	
	// subtracting the two values
	public double subtract() {
		return leftOperand - rightOperand;
	}
	
	// multiplying the two values
	public double multiply() {
		return leftOperand * rightOperand;
	}
	
	// dividing the two values
	public double divide() {
		return leftOperand / rightOperand;
	}
	
	// getting the remainder of the division of two values
	public double remainder() {
		return leftOperand % rightOperand;
	}
	
	// report what the current values are
	public String reportStatus() {
		return String.format("Left Operand: %f, Right Operand: %f", leftOperand, rightOperand);
	}

}
