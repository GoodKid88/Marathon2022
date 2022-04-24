package Day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int a = (int) (2 + Math.random() * 5);
        String mark = null;
        if (a == 2) {
            mark = "Неудовлетварительно";
        }
        if (a == 3) {
            mark = "Yдовлетварительно";
        }
        if (a == 4) {
            mark = "Хорошо";
        }
        if (a == 5) {
            mark = "Отлично";
        }

        System.out.println("Преподаватель " + name + " оценил студента " + student.getName() + " по предмету " + subject + " на оценку " + mark);
    }
}
