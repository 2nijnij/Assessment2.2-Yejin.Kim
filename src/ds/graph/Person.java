package ds.graph;

import java.util.ArrayList;
import java.util.Objects;

/*
 * This person class have to represent an individual in a social graph
 * There are attributes in this class
*/
public class Person {
	private float socialHygiene;
	private int age;
	private String name;
	private ArrayList<Person> contacts;
	// Destination business
	private Business business;


// Constructor for initializing a Person object

	/**
	 * 
	 * @param name
	 * @param age
	 * @param socialHygine
	 */
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
	
/* Calculate the infectiveness for person
 * Return the calculated value of infectiveness
*/	
	public float getInfectiveness() {
		return (age/100f)-(socialHygiene *(age/100f));
	}
	
	// Override equals method
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return Objects.equals(name, person.name);
	}
	
	// Override hashCode method
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	// Override toString method
	@Override
	public String toString() {
		return "Person: " + name + ", " + age + ", Contacts: " + contacts.size();
	}
	
    /**
     * Sets the destination business for this person.
     *
     * @param bus The business to set as the destination.
     */
    public void setBusiness(Business bus) {
        this.business = bus;
    }
    
    /**
     * Gets the destination business for this person.
     *
     * @return The destination business.
     */
    public Business getBusiness() {
        return business;
    }

}
