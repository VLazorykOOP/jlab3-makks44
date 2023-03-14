package task1;

public class Student extends Person {
    private int studentID;

    public Student(String name, int age, String gender, int studentID) {
        super(name, age, gender);
        this.studentID = studentID;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("task1.Student ID: " + studentID);
    }
}
