package Day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Andrei");
        Teacher teacher = new Teacher("Seppo", "Puuala");

        teacher.evaluate(student);
    }
}
