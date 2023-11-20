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
}
