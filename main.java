package deansoffice;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jane", "Smith", "jane.smith@example.com", "New York, Park Avenue 21", "444-555-666", new Date(1995 - 1900, 2, 14));
        Program computerScience = new Program("CS", "Computer Science Program", 8, 6);

        student1.enrollInProgram(computerScience);
        student1.addCourseGrade(4, "Algorithms");
        student1.addCourseGrade(3, "Data Structures");

        StudentManager.registerStudent(student1);

        StudentManager.advanceAllStudents();
        StudentManager.showAllStudentDetails();
    }
}
