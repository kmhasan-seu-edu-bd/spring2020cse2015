import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public List<Student> readStudents(String filename) {
        List<Student> studentList = new ArrayList<>();

        try {
            RandomAccessFile inputFile = new RandomAccessFile(filename, "r");
            String line;

            while ((line = inputFile.readLine()) != null) {
                String tokens[] = line.split(",");
                long id = Long.parseLong(tokens[0]);
                String name = tokens[1];
                Student student = new Student(id, name);
                studentList.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return studentList;
    }
}
