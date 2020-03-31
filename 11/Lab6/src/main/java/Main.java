import java.util.List;

public class Main {
    public Main() {
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        RegistrationService registrationService = new RegistrationService();

        List<Student> studentList = studentService.readStudents("students.txt");
        List<Course> courseList = courseService.readCourses("courses.txt");
        registrationService.readRegistration("registrations.txt", studentList, courseList);

        for (Student student : studentList)
            System.out.println(student);
    }

    public static void main(String args[]) {
        new Main();
    }
}
