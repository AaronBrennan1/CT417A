package a;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.DateTime;
public class TestLecturer {
    @Test void testUserInfo() {
		try {
			Lecturer l = new Lecturer("Tobias Rossman", DateTime.parse("1985-02-05"), 25678934);

			assertEquals(l.getName(), "Tobias Rossman");
			assertEquals(l.getDateOfBirth(), DateTime.parse("1985-02-05"));
			assertEquals(l.getId(), 25678934);
            assertEquals(l.getAge(), 37);
            
            // TESTING USERNAME
            assertEquals(l.getUsername(), "TobiasRossman37");
			
		} catch(Exception e) {
			assertTrue(false);
		}
	}
}
