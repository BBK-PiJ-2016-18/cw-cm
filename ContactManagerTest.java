import java.util.Calendar;
import java.util.List;
import java.util.Set;
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
	
	@Test
	public void testsAddID() {
		testManager.addID();
		int testMaxID = (testManager.getMaxID());
		assertEquals(testMaxID, 1);
	}
	
	@Test
	public void testsRepeatedAddID() {
		testManager.addID();
		testManager.addID();
		testManager.addID();
		testManager.addID();
		testManager.addID();
		int testMaxID = (testManager.getMaxID());
		assertEquals(testMaxID, 5);
	}
	
	@Test
	public void testsAddFutureMeeting() {
		SetMock contacts = new SetMock();
		CalendarMock calendar = new CalendarMock();
		testManager.addFutureMeeting(contacts, calendar);
		int testMaxID = (testManager.getMaxID());
		assertEquals(testMaxID, 1);		
	}
	
}