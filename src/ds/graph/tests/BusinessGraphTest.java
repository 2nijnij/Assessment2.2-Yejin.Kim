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
}
