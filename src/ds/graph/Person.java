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


//Constructor for initializing a Person object

	
	public Person(String name, int age, float socialHygine) {
		this.name = name;
		this.age = age;
		this.socialHygiene = socialHygiene;
		this.contacts = new ArrayList<>();
	}
	
}
