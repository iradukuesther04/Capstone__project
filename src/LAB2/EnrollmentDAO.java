package LAB2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnrollmentDAO {

    // Enroll a student in a course
    public void enrollStudent(int studentId, int courseId) {

        String sql = """
                INSERT INTO enrollments (student_id, course_id)
                VALUES (?, ?)
                """;

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            ps.setInt(2, courseId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student enrolled successfully!");
            }

        } catch (SQLException e) {
            System.out.println("Error enrolling student: "
                    + e.getMessage());
        }
    }

    // Update the grade for an enrollment
    public void updateEnrollmentGrade(
            int enrollmentId,
            double grade) {

        String sql = """
                UPDATE enrollments
                SET grade = ?
                WHERE id = ?
                """;

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setDouble(1, grade);
            ps.setInt(2, enrollmentId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Enrollment grade updated successfully!");
            } else {
                System.out.println("Enrollment not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error updating grade: "
                    + e.getMessage());
        }
    }
}
