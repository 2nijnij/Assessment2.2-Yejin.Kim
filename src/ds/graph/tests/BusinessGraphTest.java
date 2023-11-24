package ds.graph.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ds.graph.Business;
import ds.graph.BusinessGraph;
import ds.graph.Person;

public class BusinessGraphTest {
	private BusinessGraph bg;
	
	@BeforeEach
	void setUp() {
		bg = new BusinessGraph();
	}
	
	@Test
	// tests if a new business can be successfully added to the BusinessGraph
	void testAddvertex() {
		Business newBusiness = new Business("TechCorp");
		bg.addVertex(newBusiness);
		assertTrue(bg.contains(newBusiness), "Business should be added to the graph.");
	}
	
    @Test
    // test if a business can be removed from the BusinessGraph class, after added
    void testRemoveVertex() {
        Business existingBusiness = new Business("TechCorp");
        bg.addVertex(existingBusiness);
        bg.removeVertex(existingBusiness);
        assertFalse(bg.contains(existingBusiness), "Business should be removed from the graph.");
    }
    
    @Test
    // verify an edge can be added between two businesses in the graph
    void testAddEdge() {
        Business b1 = new Business("TechCorp");
        Business b2 = new Business("RetailCorp");
        bg.addVertex(b1);
        bg.addVertex(b2);

        Person route = new Person("Charlie", 40, 0.6f);
        b1.addEdge(b2, route); // Assuming addEdge method is in Business class

        assertTrue(b1.getEdges().containsKey(b2), "Edge should be added between businesses.");
    }
}
