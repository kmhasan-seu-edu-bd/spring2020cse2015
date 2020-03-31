import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public List<Student> readStudents(String filename) {
        List<Student> studentList = new ArrayList<>();
        // TODO add your code here

        // TODO delete this dummy code
        // ---
        Student a = new Student(13441, "Monirul Hasan");
        Student b = new Student(13442, "Md. Ashiqur Rahman");
        studentList.add(a);
        studentList.add(b);
        // ---

        return studentList;
    }
}
