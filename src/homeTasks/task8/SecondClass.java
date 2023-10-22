package homeTasks.task8;

public class SecondClass {
    public static final double pi = 3.14;
    double squareRound(double radius){
        double square = pi*radius*radius;
        return square;
    }

    public static double dlinnaOkruzhnosti(double radius2){
        double dlinna = 2*pi*radius2;
        return dlinna;
    }

    public void itog(double radius3){
        System.out.println("Radius = " + radius3 + " "+ "Square round = " + squareRound(radius3) + " " +
                "Dlinna okruzhnosti = " + dlinnaOkruzhnosti(radius3));
    }
}
     class SumResult {
         public static void main(String[] args) {
             SecondClass sc = new SecondClass();
             sc.squareRound(12);
             SecondClass.dlinnaOkruzhnosti(23);
             sc.itog(10);
         }
    }