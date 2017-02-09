import org.junit.*;
import static org.junit.Assert.*;

public class MeetingTest {
	@Setup
	public void setUp() {
		int id = 77;
		GregorianCalendar date = new GregorianCalendar(2017, 2, 9);
		SetMock set = new SetMock();
	}
	
	@Test
	public void testsConstructor() {
		MeetingImpl testMeeting = new MeetingImpl(date);
	}
}