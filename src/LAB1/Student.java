package LAB1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

    public abstract class Student extends Person {

        private int age;
        private Map<Course, Double> courseMarks;
        private Set<String> skills;

        public Student(String id, String name, String email, int age) {
            super(id, name, email);
            this.age = age;
            this.courseMarks = new HashMap<>();
            this.skills = new HashSet<>();
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Map<Course, Double> getCourseMarks() {
            return new HashMap<>(courseMarks);
        }

        public Set<String> getSkills() {
            return new HashSet<>(skills);
        }

        public void enrollCourse(Course course) {
            if (course != null) {
                course.addStudent(this);
            }
        }

        public void addCourseMark(Course course, double mark) {
            if (course == null || mark < 0 || mark > 100) {
                throw new IllegalArgumentException(
                        "Course must not be null and mark must be between 0 and 100."
                );
            }

            courseMarks.put(course, mark);
        }

        public void addSkill(String skill) {
            if (skill != null && !skill.isBlank()) {
                skills.add(skill);
            }
        }

        public double calculateAverageMark() {
            if (courseMarks.isEmpty()) {
                return 0.0;
            }

            return courseMarks.values()
                    .stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0.0);
        }

        public abstract double calculateGPA();

        @Override
        public String toString() {
            return super.toString() +
                    ", Age: " + age +
                    ", Courses: " + courseMarks.size() +
                    ", Skills: " + skills;
        }
    }
