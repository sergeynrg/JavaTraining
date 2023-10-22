package homeTasks.task5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Marley", 33, 4500, "Credits");
        Employee employee2 = new Employee(2, "Richy", 25, 5100, "Payments");

        employee1.uvelichenyeZPvdvoe();
        System.out.println("Novaya zarplata rabotnika : " + employee1.surname + ": " +  employee1.salary);

        employee2.uvelichenyeZPvdvoe();
        System.out.println("Novaya zarplata rabotnika : " + employee2.surname + ": " +  employee2.salary);


    }
}
