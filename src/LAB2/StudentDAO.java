package LAB2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class StudentDAO {


    public void addStudent(
            String studentNumber,
            String name,
            String email,
            int age) {

        String sql = """
                INSERT INTO students
                (student_number, name, email, age)
                VALUES (?, ?, ?, ?)
                """;

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, studentNumber);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setInt(4, age);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student registered successfully!");
            }

        }

        catch (SQLException e) {
            System.out.println("Error registering student: "
                    + e.getMessage());
        }
    }

    public void displayStudents() {

        String sql = "SELECT * FROM students ORDER BY id";

        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(sql)) {

            System.out.println("\n===== REGISTERED STUDENTS =====");

            boolean found = false;

            while (result.next()) {
                found = true;

                System.out.println("ID: " + result.getInt("id"));
                System.out.println("Student Number: "
                        + result.getString("student_number"));
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Email: " + result.getString("email"));
                System.out.println("Age: " + result.getInt("age"));
            }

            if (!found) {
                System.out.println("No students registered yet.");
            }

        } catch (SQLException e) {
            System.out.println("Error displaying students: "
                    + e.getMessage());
        }
    }

    public void deleteStudent(String studentNumber) {

        String sql = "DELETE FROM students WHERE student_number = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, studentNumber);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}