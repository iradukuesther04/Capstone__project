package LAB1;

public class GraduateStudent extends Student {

    public GraduateStudent(
            String id,
            String name,
            String email,
            int age
    ){
        super(id, name, email, age);
    }

    @Override
    public double calculateGPA() {
        double average = calculateAverageMark();

        if (average >= 90) {
            return 4.0;
        } else if (average >= 80) {
            return 3.5;
        } else if (average >= 70) {
            return 3.0;
        } else if (average >= 60) {
            return 2.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Graduate Student: " +
                super.toString() +
                ", GPA: " + calculateGPA();
    }
}