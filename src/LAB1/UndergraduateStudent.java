package LAB1;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(
            String id,
            String name,
            String email,
            int age
    )
    {
        super(id, name, email, age);
    }

    @Override
    public double calculateGPA() {
        double average = calculateAverageMark();

        return Math.round((average / 25.0) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Undergraduate Student: " +
                super.toString() +
                ", GPA: " + calculateGPA();
    }
}