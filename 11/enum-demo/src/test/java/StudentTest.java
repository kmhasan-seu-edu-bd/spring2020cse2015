import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void testCreateStudent() {
        Student student = new Student(124, "John Doe");
        System.out.println(student);
    }

    @Test
    public void testCgpaForEmptyGradeList() {
        Student student = new Student(124, "John Doe");
        double cgpa = student.getCgpa();
        Assertions.assertEquals(0.0, cgpa, 1E-5);
    }

    @Test
    public void testCgpaForSingleGradeEntry() {
        Student student = new Student(124, "John Doe");
        student.getGradeEntries().add(new GradeEntry("CSE2015", 3.00, Grade.A));
        double cgpa = student.getCgpa();
        Assertions.assertEquals(3.75, cgpa, 1E-5);
    }
}
