import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class RegistrationService {
    private Student getStudent(long studentId, List<Student> studentList) {
        for (Student student : studentList)
            if (student.getId() == studentId)
                return student;
        return null;
    }

    private Course getCourse(String courseCode, List<Course> courseList) {
        for (Course course : courseList)
            if (course.getCode().equals(courseCode))
                return course;
        return null;
    }

    public void readRegistration(String filename,
                                 List<Student> studentList,
                                 List<Course> courseList) {
        try {
            RandomAccessFile inputFile = new RandomAccessFile(filename, "r");
            String line;

            while ((line = inputFile.readLine()) != null) {
                String tokens[] = line.split(",");
                long studentId = Long.parseLong(tokens[0]);
                String courseCode = tokens[1];

                Student student = getStudent(studentId, studentList);
                Course course = getCourse(courseCode, courseList);

                if (student != null && course != null)
                    student.getCourseList().add(course);
                else System.err.printf("Cannot add course [%s] with code [%s] to student [%s] with id [%d]\n",
                        course,
                        courseCode,
                        student,
                        studentId);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
