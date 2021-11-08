package main;

import java.util.ArrayList;

public class Mediator {
	private ArrayList<Person> personList = new ArrayList<Person>();
	
	public void addUser(Person person) {
		personList.add(person);
		person.setMediator(this);
	}
	
	public void mediateMessage(String message, String name) {
		System.out.println(personList.size());
		for(int i = 0; i < personList.size(); i++) {
			if (personList.get(i).name.equals(name)) {
				System.out.println(personList.get(i).receiveMessage(message));
			}
		}
	}
	
}
