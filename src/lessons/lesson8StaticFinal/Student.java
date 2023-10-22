package lessons.lesson8StaticFinal;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String name2, int course2) {
        name = name2;
        course = course2;
        count++;
        System.out.println("Student # " + count + " ®created");
    }
}
    class StudentTest{
        public static void main(String[] args) {
            Student student = new Student("David", 1);
            Student student2 = new Student("Mariam", 3);
            Student student3 = new Student("Camilla", 3);
        }
    }

