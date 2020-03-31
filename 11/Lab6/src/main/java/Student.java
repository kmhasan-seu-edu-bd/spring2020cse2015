import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private List<Course> courseList;

    public Student() {
        courseList = new ArrayList<>();
    }

    public Student(long id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
