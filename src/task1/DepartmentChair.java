package task1;

public class DepartmentChair extends Person {
    private String department;

    public DepartmentChair(String name, int age, String gender, String department) {
        super(name, age, gender);
        this.department = department;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Department: " + department);
    }
}
