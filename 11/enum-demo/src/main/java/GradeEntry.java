public class GradeEntry {
    private String course;
    private double credits;
    private Grade grade;

    public GradeEntry(String course, double credits, Grade grade) {
        this.course = course;
        this.credits = credits;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public double getCredits() {
        return credits;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "GradeEntry{" +
                "course='" + course + '\'' +
                ", credits=" + credits +
                ", grade=" + grade +
                '}';
    }
}
