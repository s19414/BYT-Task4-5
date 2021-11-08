package main;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		AdditionHandler additionHandler = new AdditionHandler();
		SubtractionHandler subtractionHandler = new SubtractionHandler();
		MultiplicationHandler multiplicationHandler = new MultiplicationHandler();
		DivisionHandler divisionHandler = new DivisionHandler();
		
		additionHandler.next = subtractionHandler;
		subtractionHandler.next = multiplicationHandler;
		multiplicationHandler.next = divisionHandler;
		divisionHandler.next = additionHandler;
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
			
			System.out.println("Answer is: " + additionHandler.getResult(operand1, operator, operand2));
		}
	}
}
