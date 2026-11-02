package LAB1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Student student1 = new UndergraduateStudent(
                "ST001",
                "Alice",
                "alice@gmail.com",
                21
        );

        Student student2 = new GraduateStudent(
                "ST002",
                "David",
                "david@gmail.com",
                25
        );

        Course javaCourse = new Course(
                "CS101",
                "Java Programming",
                3
        );

        Course databaseCourse = new Course(
                "CS102",
                "Database Systems",
                4
        );


        Instructor instructor = new Instructor(
                "INS001",
                "Mr John",
                "john@gmail.com",
                "Computer Science"
        );


        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);


        student1.enrollCourse(javaCourse);
        student1.enrollCourse(databaseCourse);
        student2.enrollCourse(javaCourse);


        student1.addCourseMark(javaCourse, 80);
        student1.addCourseMark(databaseCourse, 90);

        student2.addCourseMark(javaCourse, 85);


        student1.addSkill("Java");
        student1.addSkill("SQL");

        student2.addSkill("Java");
        student2.addSkill("Database Design");


        Map<Course, Instructor> instructorAssignments = new HashMap<>();

        instructorAssignments.put(javaCourse, instructor);
        instructorAssignments.put(databaseCourse, instructor);

        System.out.println(" \n     REGISTERED STUDENTS        ");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\n        COURSES          ");

        System.out.println(javaCourse);
        System.out.println(databaseCourse);


        System.out.println("\n        INSTRUCTORS            ");

        System.out.println(instructor);


        System.out.println("\n       GPA CALCULATIONS          ");

        for (Student student : students) {
            System.out.println(
                    student.getName() +
                            " GPA: " +
                            student.calculateGPA()
            );
        }


        System.out.println("\n         COURSE ENROLLMENTS        ");

        System.out.println(
                javaCourse.getCourseName() +
                        ": " +
                        javaCourse.getEnrolledStudents()
        );

        System.out.println("\n        INSTRUCTOR ASSIGNMENTS       ");

        for (Map.Entry<Course, Instructor> entry :
                instructorAssignments.entrySet()) {

            System.out.println(
                    entry.getKey().getCourseName() +
                            " is taught by " +
                            entry.getValue().getName()
            );
        }
    }
}
