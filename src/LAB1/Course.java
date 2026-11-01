package LAB1;
import java.util.HashSet;
import java.util.Set;

public class Course {

    private String courseId;
    private String courseName;
    private int credits;
    private Set<Student> enrolledStudents;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.enrolledStudents = new HashSet<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Set<Student> getEnrolledStudents() {
        return new HashSet<>(enrolledStudents);
    }

    public void addStudent(Student student) {
        if (student != null) {
            enrolledStudents.add(student);
        }
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId
                + ", Course Name: " + courseName
                + ", Credits: " + credits
                + ", Enrolled Students: " + enrolledStudents.size();
    }
}