package lessons.lesson6OverloadedMethods;

public class MetjodOverloading {
    void show(int i1) {
        System.out.println(i1);
        System.out.println("Data type is Int");
    }

    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data type is String");
    }

    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type is Boolean");
    }
    void show(String s, int w){
        System.out.println("String: " + s + "" + " Int: " + w);
    }
    void show(int w, String s){
        System.out.println("Hello Java Developers!!!");
    }
}
 class MethodOverloadingTest {
        public static void main(String[] args) {
            MetjodOverloading mO = new MetjodOverloading();
            int a = 500;
            mO.show(a);
            boolean b = true;
            mO.show(b);
            String c = "Privet!!!";
            mO.show(c);
            mO.show(10, "Devs");
            mO.show("Devs", 150);
        }
    }
