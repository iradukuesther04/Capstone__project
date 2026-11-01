package LAB1;

public class Instructor extends Person {

    private String department;

    public Instructor(
            String id,
            String name,
            String email,
            String department
    ) {
        super(id, name, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Instructor: " +
                super.toString() +
                ", Department: " + department;
    }
}