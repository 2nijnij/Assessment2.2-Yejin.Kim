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
		public int totalPersonsInfected(Business start) throws IllegalArgumentException {
		    if (start == null || !vertices.contains(start)) {
		        throw new IllegalArgumentException("Start business does not exist in the graph.");
		    }
		    Set<Business> visited = new HashSet<>();
		    Queue<Business> queue = new LinkedList<>();
		    queue.add(start);
		    visited.add(start);

		    int infectedCount = 0;
		    while (!queue.isEmpty()) {
		        Business current = queue.poll();
		        for (Person person : current.getEdges().values()) {
		            infectedCount++;
		            Business nextBusiness = person.getBusiness();
		            if (nextBusiness != null && !visited.contains(nextBusiness)) {
		                queue.add(nextBusiness);
		                visited.add(nextBusiness);
		            }
		        }
		    }
		    return infectedCount;
	}
		public int minStepsToDestFromStart(Business start, Business dest) throws IllegalArgumentException {
		    if (start == null || dest == null || !vertices.contains(start) || !vertices.contains(dest)) {
		        throw new IllegalArgumentException("Start or destination business does not exist in the graph.");
		    }

		    Map<Business, Integer> stepsMap = new HashMap<>();
		    dfsMinSteps(start, dest, stepsMap, 0);
		    return stepsMap.getOrDefault(dest, -1);
		}
		
		
		// use a modified DFS to reach the destination from the starting business
		private void dfsMinSteps(Business current, Business dest, Map<Business, Integer> stepsMap, int currentSteps) {
		    if (!stepsMap.containsKey(current) || stepsMap.get(current) > currentSteps) {
		        stepsMap.put(current, currentSteps);

		        if (current.equals(dest)) {
		            return;
		        }

		        for (Person person : current.getEdges().values()) {
		            Business nextBusiness = person.getBusiness();
		            if (nextBusiness != null) {
		                dfsMinSteps(nextBusiness, dest, stepsMap, currentSteps + 1);
		            }
		        }
		    }

		}
}

