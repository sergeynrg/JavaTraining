package lessons.lesson6OverloadedMethods;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    Employee(int id2, String surname2, int age2) {
        id = id2;
        surname = surname2;
        age = age2;
    }
    Employee(int id2, int age2) {
        id = id2;
        age = age2;
    }
}
    class EmployeeTest01 {
        public static void main(String[] args) {
            Employee emp = new Employee(1, "Baks", 22);
            System.out.println(emp.age);
            Employee emp1 = new Employee(2, 32);
            System.out.println(emp1.age);
            System.out.println("The employee id is: " + emp1.id);
        }
    }

