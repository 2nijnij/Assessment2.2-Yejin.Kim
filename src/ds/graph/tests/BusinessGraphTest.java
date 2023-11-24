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
}
