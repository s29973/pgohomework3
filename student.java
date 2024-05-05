package deansoffice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private static int idCounter = 1;

    private String givenName;
    private String familyName;
    private String contactEmail;
    private String homeAddress;
    private String phone;
    private Date dob;
    private String studentId;
    private String enrollmentStatus;
    private Program program;
    private int currentTerm;
    private List<CourseGrade> grades;

    public Student(String givenName, String familyName, String contactEmail, String homeAddress, String phone, Date dob) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.contactEmail = contactEmail;
        this.homeAddress = homeAddress;
        this.phone = phone;
        this.dob = dob;
        this.studentId = "id" + idCounter++;
        this.enrollmentStatus = "Prospective";
        this.grades = new ArrayList<>();
    }

    public void enrollInProgram(Program program) {
        this.program = program;
        this.currentTerm = 1;
        this.enrollmentStatus = "Enrolled";
    }

    public void addCourseGrade(int gradeValue, String subject) {
        grades.add(new CourseGrade(gradeValue, subject));
    }

    public void advanceToNextTerm() {
        if (currentTerm < program.getTotalTerms() && !exceedsAllowedFails()) {
            currentTerm++;
        } else {
            enrollmentStatus = "Graduated";
        }
    }

    private boolean exceedsAllowedFails() {
        long failedCourses = grades.stream().filter(g -> g.getGradeValue() < 3).count();
        return failedCourses > program.getMaxAllowedFails();
    }

    @Override
    public String toString() {
        return String.format("%s %s, ID: %s, Term: %d, Status: %s", givenName, familyName, studentId, currentTerm, enrollmentStatus);
    }
}
