package ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Business {
	private String name;
	// Mapping destination Business to Person(edge)
	private Map<Business, Person> edges;
	
	public Business(String name) {
		this.name = name;
		this.edges = new HashMap<>();
	}
	
    /**
     * Adds an edge from this Business to another via a Person.
     * If an edge to the destination already exists, only the higher weighted edge is kept.
     * 
     * @param dest The destination Business.
     * @param route The Person representing the edge.
     */
    public void addEdge(Business dest, Person route) {
        if (dest == null || route == null) return;

        Person existingRoute = edges.get(dest);
        if (existingRoute == null || route.getInfectiveness() > existingRoute.getInfectiveness()) {
            edges.put(dest, route);
        }
    }
    
    /**
     * Removes an edge to a specified Business.
     * 
     * @param dest The destination Business to remove the edge to.
     */
    public void removeEdge(Business dest) {
        edges.remove(dest);
    }
    
    // Getters and setters
    public String getName() {
    	return name;
    }
    
    public Map<Business, Person> getEdges() {
    	return edges;
    }
}
