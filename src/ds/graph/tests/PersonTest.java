package ds.graph.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ds.graph.Person;

public class PersonTest {
	private Person person;
	
	@BeforeEach
	void setUp() {
		person = new Person("Ashley", 30, 0.8f);
	}
	@Test
	void testGetName() {
	    assertEquals("Ashley", person.getName(), "Name should be Alice.");
	}
	
    @Test
    void testSetName() {
        person.setName("Bob");
        assertEquals("Bob", person.getName(), "Name should be updated to Bob.");
    }
    
    @Test
    void testGetAge() {
        assertEquals(30, person.getAge(), "Age should be 30.");
    }

    @Test
    void testSetAge() {
        person.setAge(35);
        assertEquals(35, person.getAge(), "Age should be updated to 35.");
    }
    
    @Test
    void testGetSocialHygiene() {
        assertEquals(0.8f, person.getSocialHygiene(), 0.01, "Social hygiene should be 0.8.");
    }
    
    @Test
    // test if the getters and setters for name, age, and socialHygiene work correctly
    void testSetSocialHygiene() {
        person.setSocialHygiene(0.9f);
        assertEquals(0.9f, person.getSocialHygiene(), 0.01, "Social hygiene should be updated to 0.9.");
    }
    
    @Test
    // verify that contacts can be correctly added from a contact list
    void testAddContact() {
        Person newContact = new Person("Charlie", 40, 0.7f);
        person.addContact(newContact);
        assertTrue(person.getContacts().contains(newContact), "Charlie should be added as a contact.");
    }

    @Test
 // verify that contacts can be correctly removed from a contact list
    void testRemoveContact() {
        Person contact = new Person("Charlie", 40, 0.7f);
        person.addContact(contact);
        person.removeContact(contact);
        assertFalse(person.getContacts().contains(contact), "Charlie should be removed from contacts.");
    }
    
    @Test
    // check the correctness of the calculation
    void testInfectivenessCalculation() {
        float expectedInfectiveness = (30 / 100f) - (0.8f * (30 / 100f));
        assertEquals(expectedInfectiveness, person.getInfectiveness(), 0.01, 
                     "Infectiveness should be calculated correctly.");
    }


    
}
