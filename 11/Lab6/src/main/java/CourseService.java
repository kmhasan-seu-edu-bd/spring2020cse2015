import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class CourseService {
    public List<Course> readCourses(String filename) {
        List<Course> courseList = new ArrayList<>();

        try {
            RandomAccessFile inputFile = new RandomAccessFile("courses.txt", "r");
            String line;

            while ((line = inputFile.readLine()) != null) {
                String tokens[] = line.split(",");
                String code = tokens[0];
                String title = tokens[1];
                Course course = new Course(code, title);
                courseList.add(course);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return courseList;
    }

}
