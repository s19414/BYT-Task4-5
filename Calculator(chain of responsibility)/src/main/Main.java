package main;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		while(true) 
		{
			Scanner input = new Scanner(System.in);
			//prompt for first operand
			System.out.println("Enter first operand: ");
			double operand1 = input.nextDouble();
			
			//prompt for operator
			System.out.println("Enter operator(type +, -, * or /) ");
			String operator = input.next();
			
			//prompt for second operand
			System.out.println("Enter seconds operand: ");
			double operand2 = input.nextDouble();
			
			System.out.println("Answer is: " + additionHandler(operand1, operator, operand2));
		}
	}
	
	private static double additionHandler(double operand1, String operator, double operand2) {
		if(operator.equals(new String("+"))) {
			return operand1 + operand2;
		}
		else {
			return subtractionHandler(operand1, operator, operand2);
		}
	}
	private static double subtractionHandler(double operand1, String operator, double operand2) {
		if(operator.equals(new String("-"))) {
			return operand1 - operand2;
		}
		else {
			return multiplicationHandler(operand1, operator, operand2);
		}
	}
	private static double multiplicationHandler(double operand1, String operator, double operand2) {
		if(operator.equals(new String("*"))) {
			return operand1 * operand2;
		}
		else {
			return divisionHandler(operand1, operator, operand2);
		}
	}
	private static double divisionHandler(double operand1, String operator, double operand2) {
		if(operator.equals(new String("/"))) {
			return operand1 / operand2;
		}
		else {
			return 0;
		}
	}
}
