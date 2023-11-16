package ds.graph;

import java.util.ArrayList;

/*
 * This person class have to represent an individual in a social graph
 * There are attributes in this class
*/
public class Person {
	private float socialHygiene;
	private int age;
	private String name;
	private ArrayList<Person> contacts;


// Constructor for initializing a Person object

	
	public Person(String name, int age, float socialHygine) {
		this.name = name;
		this.age = age;
		this.socialHygiene = socialHygiene;
		this.contacts = new ArrayList<>();
	}
	
// Accessor and Mutator	
	public float getSocialHygiene() {
		return socialHygiene;
	}
	
	public void setSocialHygiene(float socialHygiene) {
		this.socialHygiene = socialHygiene;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Person> getContacts() {
		return contacts;
	}
	
// Method for adding a contact
	
	public void addContact(Person person) {
		if (person != null && !contacts.contains(person)) {
			contacts.add(person);
		}
	}

// Method for removing a contact
	public void removeContact(Person person) {
		contacts.remove(person);
	}
}
