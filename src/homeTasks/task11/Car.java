package homeTasks.task11;

public class Car {
    String color;
    String engine;
    int doorsAmount;

    public Car(String color,String engine, int doorsAmount ){
        this.color=color;
        this.engine=engine;
        this.doorsAmount=doorsAmount;

    }
    static class CarTest {
        void changeDoorsCount(Car c, int doorsAmount){
            c.doorsAmount=doorsAmount;
        }
        void changeColor(Car c1, Car c2){
            String color = c1.color;
            c1.color= c2.color;
            c2.color=color;
        }
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red", "V8", 4);
        Car car2 = new Car("black", "V12", 2);
        ct.changeDoorsCount(car1,3);
        ct.changeColor(car1, car2);

        System.out.println("Ino about 1st car: Color:" + car1.color + " Engine: " + car1.engine + " Doors Amount: " + car1.doorsAmount);
        System.out.println("Ino about 2nd car: Color:" + car2.color + " Engine: " + car2.engine + " Doors Amount: " + car2.doorsAmount);
    }
}

