package main;

public abstract class Handler {
	
	public Handler next;
	
	public void SetNext(Handler next) {
		this.next = next;
	}
	
	public abstract double getResult(double operand1, String operator, double operand2);
	
}

