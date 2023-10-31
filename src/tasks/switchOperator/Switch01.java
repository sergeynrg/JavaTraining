package tasks.switchOperator;

import java.util.Random;

public class Switch01 {
    public static void main(String[] args) {
        int dayNumber = new Random().nextInt(100);
        System.out.println(dayNumber);

        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                default:
                    System.out.println("ooops!!!");

        }
    }
}
//нужно использовать, когда есть набор однотипных вариантов и нужно выбрать что то конкретное, например в каком браузере запускать тесты