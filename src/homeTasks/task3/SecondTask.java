package homeTasks.task3;

public class SecondTask {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

       int summaA =  a-- - --a + ++a + a++ + a;
       int summaB = ++b - b++ + ++b - --b;

        System.out.println(summaA);
        System.out.println(summaB);



    }
}
