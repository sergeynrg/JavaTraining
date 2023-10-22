package homeTasks.task6;

public class HomeOverloading {
    int sum (){
        int i = 0;
        return i;
    }
    int sum (int a){
        return a;
    }
    int sum (int a, int b){
        return a + b;
    }
    int sum (int a, int b, int c){
        return a + b + c;
    }
    int sum (int a, int b, int c, int d){
        return a + b + c + d;
    }
}
class HomeOverloadingTest{
    public static void main(String[] args) {
        HomeOverloading hO = new HomeOverloading();
        int q = hO.sum();
        System.out.println("Method without parameter " + q);
        int w = hO.sum(23);
        System.out.println("The single parameter: " + w);
        int e = hO.sum(20, 30);
        System.out.println("The sum of two parameters: " + e);
        int r = hO.sum(10, 40, 20);
        System.out.println("The sum of three parameters: " + r);
        int t = hO.sum(10,20,30,40);
        System.out.println("The sum of four parameters: " + t);
    }
}

