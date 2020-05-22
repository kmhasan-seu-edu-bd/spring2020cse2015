import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private List<GradeEntry> gradeEntries;

    public Student() {
        gradeEntries = new ArrayList<>();
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

    public List<GradeEntry> getGradeEntries() {
        return gradeEntries;
    }

    public double getCgpa() {
        double sum = 0.0;
        double totalCredits = 0.0;
        for (GradeEntry gradeEntry : gradeEntries) {
            double product = gradeEntry.getCredits() * gradeEntry.getGrade().getGradePoint();
            sum = sum + product;
            totalCredits = totalCredits + gradeEntry.getCredits();
        }

        if (Math.abs(totalCredits) < 1E-5)
            return 0.0;

        double cgpa = sum / totalCredits;

        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gradeEntries=" + gradeEntries + '\'' +
                ", CGPA=" + getCgpa() +
                '}';
    }
}
