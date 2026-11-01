package LAB2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CourseDAO {

    // Display all courses
    public void displayCourses() {

        String sql = "SELECT * FROM courses ORDER BY id";

        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(sql)) {

            System.out.println("\n===== AVAILABLE COURSES =====");

            boolean found = false;

            while (result.next()) {
                found = true;

                System.out.println("Course ID: " + result.getInt("id"));
                System.out.println("Course Code: "
                        + result.getString("course_code"));
                System.out.println("Course Name: "
                        + result.getString("course_name"));
                System.out.println("Credits: "
                        + result.getInt("credits"));
                System.out.println("----------------------------");
            }

            if (!found) {
                System.out.println("No courses found.");
            }

        } catch (SQLException e) {
            System.out.println("Error displaying courses: "
                    + e.getMessage());
        }
    }
}
