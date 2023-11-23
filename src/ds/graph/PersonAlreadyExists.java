package ds.graph;

public class PersonAlreadyExists extends Exception {
    private static final long serialVersionUID = 1L;
    // allow class have a unique value
    
    public PersonAlreadyExists(String message) {
        super(message);
    }
}