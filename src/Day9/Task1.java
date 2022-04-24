package Day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Group A");
        Teacher teacher = new Teacher("Victor", "Maths");

        student.printInfo();
        teacher.printInfo();
    }
}
