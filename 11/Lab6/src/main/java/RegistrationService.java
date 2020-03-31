import java.util.List;

public class RegistrationService {
    public void readRegistration(String filename,
                                 List<Student> studentList,
                                 List<Course> courseList) {
        // TODO add your code here

        // TODO remove this dummy code
        // ---
        int studentIndex = 0; // use some for loop to find the index of the student from the student list
        int courseIndex = 0;
        Student s = studentList.get(studentIndex);
        Course c = courseList.get(courseIndex);
        s.getCourseList().add(c);
        // ---
    }
}
