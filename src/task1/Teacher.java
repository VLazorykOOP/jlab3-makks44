package task1;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Subject: " + subject);
    }
}
