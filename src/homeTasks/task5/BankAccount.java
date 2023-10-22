package homeTasks.task5;

public class BankAccount {
    int balance = 100;

    double popolnenieScheta(double uvelichenieScheta){
        double newBalance = balance + uvelichenieScheta;
        return newBalance;
    }

    double snyatieSoScheta (double umenshenieScheta) {
        double newBalance = balance - umenshenieScheta;
        return newBalance;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        double summaPopolnnya = ba.popolnenieScheta(30.4);
        double summaSnyatia = ba.snyatieSoScheta(20.2);
        System.out.println("Увеличение счета : " + summaPopolnnya);
        System.out.println("Уменьшение счета :  " + summaSnyatia);

    }
}
