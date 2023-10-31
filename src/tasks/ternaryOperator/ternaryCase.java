package tasks.ternaryOperator;

import java.util.Random;

public class ternaryCase {
    public static void main(String[] args) {

    int a = new Random().nextInt(8);
    a = 3;
        System.out.println(a);
    int b = new Random().nextInt(8);
        System.out.println(b);

    int c = (a + b) >10 ? a : b;
        System.out.println(c);
//если условие до знака ? будет верное - то выводиться будет 'a', если выражение будет неверное - то 'b';
    }
}
