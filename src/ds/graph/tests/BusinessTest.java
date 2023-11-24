package ds.graph.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ds.graph.Business;
import ds.graph.Person;

public class BusinessTest {

	private Business business;
	
	@BeforeEach
	void setUp() {
		business = new Business("TechCorp");
	}
	
	@Test
	// check if an edge is correctly added
	void testAddEdge() {
		Business destination = new Business("RetailCorp");
		Person route = new Person("Sheldon", 40, 0.6f);
		business.addEdge(destination, route);
		
		assertTrue(business.getEdges().containsKey(destination), "Edge should be added to the business.");
	}
	
	@Test
	// check if the edge is successfully removed from the business's edges map
	void testRemoveEdge() {
		Business destination = new Business("RetailCorp");
		Person route = new Person("Sheldon", 40, 0.6f);
		business.addEdge(destination, route);
		business.removeEdge(destination);
		
		assertFalse(business.getEdges().containsKey(destination), "Edge should be removed from the business.");
		
	}
	
	@Test
	void testGetEdges() {
		Business destination = new Business("RetailCorp");
		Person route = new Person("Sheldon", 40, 0.6f);
		business.addEdge(destination, route);
		
		assertNotNull(business.getEdges(), "Edges map should not be null.");
		assertEquals(1, business.getEdges().size(), "Edges map should contain one entry.");
		
	}
}
