package main;

public class Person {
	public String name;
	private Mediator mediator;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void sendMessage(String message, String recipientName) {
		mediator.mediateMessage(message, recipientName);
	}
	
	public String receiveMessage(String message) {
		return "Hey, its " + name + ", I received your message: " + message;
	}
	
}
