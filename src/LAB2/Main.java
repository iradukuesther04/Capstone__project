package LAB2;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

  public static void main(String[] args) {
      EnrollmentDAO enrollmentDAO = new EnrollmentDAO();


      enrollmentDAO.enrollStudent(1, 1);


      enrollmentDAO.updateEnrollmentGrade(1, 85.5);
  }
}
// connecting interj and database
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
// ADDING STUDENT
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
// DELETING STUDENT FROM DATABASE
    //
//        StudentDAO studentDAO = new StudentDAO();
//
//
//        System.out.println("BEFORE DELETION:");
//        studentDAO.displayStudents();
//
//
//        studentDAO.deleteStudent("ST001");
//
//
//        System.out.println("\nAFTER DELETION:");
//        studentDAO.displayStudents();
//    }
//}
// DISPLAY COUSES
//
//        CourseDAO courseDAO = new CourseDAO();
//
//        courseDAO.displayCourses();
//    }
//}