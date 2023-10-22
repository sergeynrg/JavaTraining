package lessons.lesson8StaticFinal;

public class Test1 {
    int a = 10;

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.a = t.a * 2;
        System.out.println(t.a);
    }
}
