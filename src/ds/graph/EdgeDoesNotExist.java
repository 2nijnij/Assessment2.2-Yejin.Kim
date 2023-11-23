package ds.graph;

public class EdgeDoesNotExist extends Exception {
    private static final long serialVersionUID = 3L; 
    // allow class have a unique value

    public EdgeDoesNotExist(String message) {
        super(message);
    }
}