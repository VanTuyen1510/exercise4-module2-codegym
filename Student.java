package Main4;

public class Student {
    private String name = "Tuyên";
    private String classes = "T10";

    public Student() {

    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setClasses(String newClasses) {
        this.classes = newClasses;
    }

    public static class Test {
        public static void main(String[] args) {
            Student student = new Student();
            student.setName("Neymar");
            System.out.println(student.name);

            student.setClasses("N10");
            System.out.println(student.classes);
        }
    }
}
