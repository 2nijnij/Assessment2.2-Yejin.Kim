package ds.graph.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ds.graph.Business;
import ds.graph.Person;

public class BusinessTest {

	private Business business;
	
	@BeforeEach
	void setUp() {
		business = new Business("TechCorp");
	}
	
}
