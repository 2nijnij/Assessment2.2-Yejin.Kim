package ds.graph;

public class PersonDoesNotExist extends Exception {
	private static final long serialVersionUID = 2L;
	// allow class have a unique value
	
	public PersonDoesNotExist(String message) {
		super(message);
	}
}
