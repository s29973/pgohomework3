package deansoffice;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private static List<Student> studentDirectory = new ArrayList<>();

    public static void registerStudent(Student student) {
        studentDirectory.add(student);
    }

    public static void advanceAllStudents() {
        for (Student student : studentDirectory) {
            student.advanceToNextTerm();
        }
    }

    public static void showAllStudentDetails() {
        for (Student student : studentDirectory) {
            System.out.println(student);
        }
    }
}
