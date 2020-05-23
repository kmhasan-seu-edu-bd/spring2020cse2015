package interfacedemo.student;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    @Test
    public void testCreateStudent() {
        Student a = new Student(10, "Hasan");
        Student b = new Student(11, "Rahman");
        Student c = new Student(12, "Ahmed");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    @Test
    public void testStringSorting() {
        String[] strings = {"Hasan", "Rahman", "Ahmed"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        List<String> names = new ArrayList<>();
        names.add("Hasan");
        names.add("Rahman");
        names.add("Ahmed");
        Collections.sort(names);
        System.out.println(names);
    }

    @Test
    public void testSortStudents() {
        Student a = new Student(20, "Hasan");
        Student b = new Student(11, "Rahman");
        Student c = new Student(32, "Ahmed");
        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);

        Collections.sort(students);

        for (Student s: students)
            System.out.println(s);
    }
}
