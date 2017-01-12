import org.junit.*;
import static org.junit.Assert.*;

public class ContactManagerTest {
	private ContactManager testManager;
	
	//setup
	@Before
	public void setUp() {
		testManager = new ContactManagerImpl();
	}
	
	// test
	@Test
	public void testsMaxID() {	
		int testMaxID = testManager.maxID;
		assertEquals(testMaxID, 0);		
	}
	
}