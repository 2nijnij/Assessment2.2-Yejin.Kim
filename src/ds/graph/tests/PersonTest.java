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
}
