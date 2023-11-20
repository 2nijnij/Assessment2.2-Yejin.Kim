package ds.graph;
import java.util.*;

public class BusinessGraph {
	private ArrayList<Business> vertices;
	
	public BusinessGraph() {
		vertices = new ArrayList<>();
	}
	
	public void addVertex(Business bus) throws IllegalArgumentException {
		if (bus == null) {
			throw new IllegalArgumentException("Business cannot be null");
		}
		if (!vertices.contains(bus)) {
			vertices.add(bus);
		}
	}
	
	public void removeVertex(Business bus) throws IllegalArgumentException {
		if (bus == null || !vertices.contains(bus)) {
			throw new IllegalArgumentException("Business does not exist in the graph");
		}
		vertices.remove(bus);
		// Remove all edges associated with this business
		for (Business b : vertices) {
			b.removeEdge(bus);
		}
	}
}

