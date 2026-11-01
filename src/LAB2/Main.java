package LAB2;

import java.sql.Connection;
import java.sql.SQLException;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        try (Connection connection = DBConnection.getConnection()) {
//
//            System.out.println("Connected to PostgreSQL successfully!");
//
//        } catch (SQLException e) {
//
//            System.out.println("Database connection failed.");
//            System.out.println(e.getMessage());
//
//        }
//
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//
//        StudentDAO studentDAO = new StudentDAO();
//
//
//        studentDAO.addStudent(
//                "ST001",
//                "Jean Pierre",
//                "jean@example.com",
//                20
//        );
//
//
//        studentDAO.displayStudents();
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//
//        StudentDAO studentDAO = new StudentDAO();
//
//        // Display students before deletion
//        System.out.println("BEFORE DELETION:");
//        studentDAO.displayStudents();
//
//        // Delete the test student
//        studentDAO.deleteStudent("ST001");
//
//        // Display students after deletion
//        System.out.println("\nAFTER DELETION:");
//        studentDAO.displayStudents();
//    }
//}
//public class Main {
//
//    public static void main(String[] args) {
//
//        CourseDAO courseDAO = new CourseDAO();
//
//        courseDAO.displayCourses();
//    }
//}

public class Main {

    public static void main(String[] args) {

        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();

        // Enroll student ID 1 in course ID 1
        enrollmentDAO.enrollStudent(1, 1);

        // Update the grade for enrollment ID 1
        enrollmentDAO.updateEnrollmentGrade(1, 85.5);
    }
}