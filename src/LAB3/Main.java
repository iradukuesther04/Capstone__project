package LAB3;
import LAB2.StudentDAO;
import LAB2.CourseDAO;
import LAB2.EnrollmentDAO;
import LAB2.DBConnection;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.println("\n========================================");
            System.out.println("     UNIVERSITY MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Add Course");
            System.out.println("5. View All Courses");
            System.out.println("6. Remove Course");
            System.out.println("7. Enroll Student in Course");
            System.out.println("8. View Students and Their Courses");
            System.out.println("9. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        System.out.println("Add Student selected.");
                        break;

                    case 2:
                        System.out.println("View All Students selected.");
                        break;

                    case 3:
                        System.out.println("Remove Student selected.");
                        break;

                    case 4:
                        System.out.println("Add Course selected.");
                        break;

                    case 5:
                        System.out.println("View All Courses selected.");
                        break;

                    case 6:
                        System.out.println("Remove Course selected.");
                        break;

                    case 7:
                        System.out.println("Enroll Student in Course selected.");
                        break;

                    case 8:
                        System.out.println("View Students and Their Courses selected.");
                        break;

                    case 9:
                        running = false;
                        System.out.println("Thank you for using the University Management System!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 9.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        scanner.close();
    }
}