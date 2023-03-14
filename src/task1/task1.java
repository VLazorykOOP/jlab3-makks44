package task1;

public class task1 {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Student("John Smith", 20, "Male", 12345);
        people[1] = new Teacher("Jane Doe", 35, "Female", "Computer Science");
        people[2] = new DepartmentChair("Bob Johnson", 50, "Male", "Computer Science");
        people[3] = new Student("Emily Davis", 19, "Female", 67890);

        for (Person person : people) {
            person.show();
            System.out.println();
        }
    }
}
