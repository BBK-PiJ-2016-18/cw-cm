import org.junit.*;
import static org.junit.Assert.*;

public class ContactManagerTest {
	
	private ContactManagerImpl testManager;
	
	//setup
	@Before
	public void setUp() {
		testManager = new ContactManagerImpl();
	}
	
	// test
	@Test
	public void testsMaxID() {
		int testMaxID = (testManager.getMaxID());
		assertEquals(testMaxID, 0);
	}
	
	public void testsAddID() {		
		testManager.addID();
		int testMaxID = (testManager.getMaxID());
		assertEquals(testMaxID, 1);
	}
	
}