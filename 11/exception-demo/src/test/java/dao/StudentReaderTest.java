package dao;

import exceptiondemo.dao.StudentReader;
import org.junit.jupiter.api.Test;

public class StudentReaderTest {
    @Test
    public void testReadStudent() {
        StudentReader studentReader = new StudentReader();
        studentReader.readStudent("students.txt");
    }
}
