package deansoffice;

public class CourseGrade {
    private int gradeValue;
    private String courseName;

    public CourseGrade(int gradeValue, String courseName) {
        this.gradeValue = gradeValue;
        this.courseName = courseName;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    public String getCourseName() {
        return courseName;
    }
}
