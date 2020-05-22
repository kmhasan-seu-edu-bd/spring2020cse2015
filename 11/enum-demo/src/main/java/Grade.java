public enum Grade {
    A_PLUS      (4.00),
    A           (3.75),
    A_MINUS     (3.50),
    B_PLUS      (3.25),
    B           (3.00);

    Grade(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    double gradePoint;

    double getGradePoint() {
        return gradePoint;
    }
}
