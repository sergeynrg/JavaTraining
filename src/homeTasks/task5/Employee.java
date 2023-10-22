package homeTasks.task5;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    Employee (int id2, String surname2, int age2, int salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    int uvelichenyeZPvdvoe () {
        salary *= 2;
        return salary;

    }
}
