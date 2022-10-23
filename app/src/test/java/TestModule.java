import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.joda.time.DateTime;
public class TestModule {
   
    
    
    @Test void testModuldeInfo() {
		Lecturer lecturer = new Lecturer("Steve Jobs", DateTime.parse("1955-04-12"), 57463287);
		Module module = new Module("Rings", "MA417", lecturer);
		Student student1 = new Student("Joshua Cheptegei", DateTime.parse("1955-04-12"), 57683746);
		Student student2 = new Student("Eluid Kipchoge", DateTime.parse("1987-06-19"), 17502967);
		module.addStudent(student1);
		module.addStudent(student2);
		try {
			

            assertEquals(module.getName(), "Rings");
			assertEquals(module.getId(), "MA417");
            assertEquals(module.getLecturer().getName(), "Steve Jobs");
			assertEquals(module.getStudents().size(), 2);
            assertEquals(module.getStudents().get(1).getName(), "Eluid Kipchoge");

            
            
		} catch(Exception e) {
			assertTrue(false);
		}
	}
}
