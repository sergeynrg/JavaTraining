package homeTasks.task8;

public class FirstStatic {
     static double umnozhenie ( double a, double b, double c){
            double sum = a + b + c;
            return sum;
        }

     static void delenie(double a, double c){
         System.out.println("Целое частное: " + a/c + "; Остаток = " + a%c);
     }

        public static void main (String[]args){
            System.out.println(FirstStatic.umnozhenie(33, 10, 3));
            FirstStatic.delenie(33, 3);
            System.out.println(FirstStatic.umnozhenie(12.2, 33.3, 4));
            FirstStatic.delenie(17, 21.2);
        }
    }
