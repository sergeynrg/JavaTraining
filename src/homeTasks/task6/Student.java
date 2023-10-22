package homeTasks.task6;

public class Student {
    int numberOfStudentCard;
    String firstName;
    String lastName;
    int year;
    int course;
    int mathAverageGrade;
    int economicAverageGrade;
    int foreignLanguageAverageGrade;
    Student (int numberOfStudentCard2, String firstName2, String lastName2, int year2, int course2, int mathAverageGrade2, int economicAverageGrade2, int foreignLanguageAverageGrade2){
        this(numberOfStudentCard2, firstName2, lastName2, course2);
        year = year2;
        mathAverageGrade = mathAverageGrade2;
        economicAverageGrade = economicAverageGrade2;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade2;
    }
    Student (int numberOfStudentCard3, String firstName3, String lastName3, int course3){
        numberOfStudentCard = numberOfStudentCard3;
        firstName = firstName3;
        lastName = lastName3;
        course = course3;
    }
    Student(){
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student student = new Student(1, "Serhii", "Nehoda", 1991, 5, 10, 11, 9);
        Student student1 = new Student();
        Student student2 = new Student(10, "Bob", "Test", 2);
        System.out.println("The course is: " + student.course);
        System.out.println("The number of student card is: " + student.numberOfStudentCard);
        System.out.println("The average grade is: " + (student.mathAverageGrade + student.economicAverageGrade + student.foreignLanguageAverageGrade)/3);
        System.out.println("Second student: " + student2.firstName + " " + student2.lastName);
        System.out.println(student1.firstName);

    }
}
