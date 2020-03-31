import java.util.ArrayList;
import java.util.List;

public class CourseService {
    public List<Course> readCourses(String filename) {
        List<Course> courseList = new ArrayList<>();
        // TODO add your code here

        // TODO remove this dummy code
        // ---
        Course a = new Course("CSE4047", "Advanced Java");
        Course b = new Course("CSE4048", "Advanced Java Lab");
        courseList.add(a);
        courseList.add(b);
        // ---

        return courseList;
    }
}
