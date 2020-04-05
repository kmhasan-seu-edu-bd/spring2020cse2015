import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class RegistrationService {
    private Student indexOf(long studentId, List<Student> studentList) {
        for (Student student : studentList)
            if (student.getId() == studentId)
                return student;
        return null;
    }

    private Course indexOf(String courseCode, List<Course> courseList) {
        for (Course course : courseList)
            if (course.getCode().equals(courseCode))
                return course;
        return null;
    }

    public void readRegistration(String filename,
                                 List<Student> studentList,
                                 List<Course> courseList) {
        try {
            RandomAccessFile inputFile = new RandomAccessFile("registrations.txt", "r");
            String line;

            while ((line = inputFile.readLine()) != null) {
                String tokens[] = line.split(",");
                long studentId = Long.parseLong(tokens[0]);
                String courseCode = tokens[1];

                Student student = indexOf(studentId, studentList);
                Course course = indexOf(courseCode, courseList);

                if (student != null && course != null)
                    student.getCourseList().add(course);
                else System.err.printf("Cannot add course [%s] to student [%s]\n", course, student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
