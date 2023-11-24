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

        Person route = new Person("Sheldon", 40, 0.6f);
        b1.addEdge(b2, route); // Assuming addEdge method is in Business class

        assertTrue(b1.getEdges().containsKey(b2), "Edge should be added between businesses.");
    }
    
    @Test
    void testTotalPersonsInfected() {
     // Assuming totalPersonsInfected calculates the total number of persons infected from a start business
        Business startBusiness = new Business("StartBusiness");
        bg.addVertex(startBusiness);
     // Add connections from startBusiness that would result in infections

        int totalInfected = bg.totalPersonsInfected(startBusiness);
        int expectedInfected = 0; 
     // Set the expected number of infected persons
        assertEquals(expectedInfected, totalInfected, "Total number of infected persons should match expected value.");
    }
    
    @Test
    void testMinStepsToDestFromStart() {
        Business startBusiness = new Business("StartBusiness");
        Business intermediateBusiness = new Business("IntermediateBusiness");
        Business destBusiness = new Business("DestBusiness");

        bg.addVertex(startBusiness);
        bg.addVertex(intermediateBusiness);
        bg.addVertex(destBusiness);

        Person route1 = new Person("Connector1", 30, 0.5f);
        route1.setBusiness(intermediateBusiness);
        startBusiness.addEdge(intermediateBusiness, route1);
        
        Person route2 = new Person("Connector2", 35, 0.6f);
        route2.setBusiness(destBusiness);
        intermediateBusiness.addEdge(destBusiness, route2);

        System.out.println("Edges from Start: " + startBusiness.getEdges().size());
        System.out.println("Edges from Intermediate: " + intermediateBusiness.getEdges().size());

        int steps = bg.minStepsToDestFromStart(startBusiness, destBusiness);
        System.out.println("Calculated Steps: " + steps);
        int expectedSteps = 2; 
        assertEquals(expectedSteps, steps, "Minimum steps to destination should match expected value.");
    }

    
    @Test
    void testIsStronglyConnected() {
        // Set up your businesses and connections
        Business startBusiness = new Business("StartBusiness");
        bg.addVertex(startBusiness);

        boolean isConnected = bg.isStronglyConnected(startBusiness);
        assertTrue(isConnected, "Graph should be strongly connected from the start business.");
    }

}