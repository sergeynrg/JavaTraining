package lessons.lesson8StaticFinal;

public class Car {
    String color = "Blue";
    String engine = "V6";
}
class Human{
    String name = "Ivan";
    Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c = new Car();
        h1.c = new Car(); // если объекту Car добавить final то компилятор ругнется, так как нельзя создавать non-static модификатор в объекте класса
        h1.c.engine = "V8";
    }
}
