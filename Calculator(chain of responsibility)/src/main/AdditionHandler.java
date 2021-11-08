package main;

public class AdditionHandler extends Handler{

	public double getResult(double operand1, String operator, double operand2) {
		if(operator.equals(new String("+"))) {
			return operand1 + operand2;
		}
		else {
			return next.getResult(operand1, operator, operand2);
		}
	}
	
}