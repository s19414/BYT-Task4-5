package main;

public class Test {
	static Mediator mediator = new Mediator();
	public static Person dorpy = new Person("dorpy");
	public static Person megaman = new Person ("megaman");
	public static Person cheesegod = new Person("cheesegod");
	
	public static void main(String[] args) {
		mediator.addUser(cheesegod);
		mediator.addUser(dorpy);
		mediator.addUser(megaman);
		dorpy.sendMessage("Heeeyy you idiot", "cheesegod");
	}
}
