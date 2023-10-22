package homeTasks.task4;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.firstName = "Nikolay";
        st1.lastName = "Gutsul";
        st1.year = 1991;
        st1.mathAverageGrade = 10;
        st1.economicAverageGrade = 11;
        st1.foreignLanguageAverageGrade = 12;

        st2.firstName = "Serhii";
        st2.lastName = "Nehoda";
        st2.year = 1991;
        st2.mathAverageGrade = 8;
        st2.economicAverageGrade = 10;
        st2.foreignLanguageAverageGrade = 12;

        st3.firstName = "Artem";
        st3.lastName = "Weather";
        st3.year = 1997;
        st3.mathAverageGrade = 5;
        st3.economicAverageGrade = 8;
        st3.foreignLanguageAverageGrade = 2;

        System.out.println("Student: "+ st1.firstName + " " + st1.lastName + " - the Average grare is : "
                + (st1.mathAverageGrade + st1.economicAverageGrade + st1.foreignLanguageAverageGrade)/3);

        System.out.println("Student: "+ st2.firstName + " " + st2.lastName + " - the Average grare is : "
                + (st2.mathAverageGrade + st2.economicAverageGrade + st2.foreignLanguageAverageGrade)/3);

        System.out.println("Student: "+ st3.firstName + " " + st3.lastName + " - the Average grare is : "
                + (st3.mathAverageGrade + st3.economicAverageGrade + st3.foreignLanguageAverageGrade)/3);
    }
}
