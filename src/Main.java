import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Account acc = new Account(8000);
//        System.out.println("Enter Amount to Deposit: ");
//        acc.credit(sc.nextDouble());
//        System.out.println("Enter Amount to Withdraw: ");
//        acc.debit(sc.nextDouble());
//        System.out.println(acc.getBalance());

        SavingsAccount sv = new SavingsAccount(800, 5);
        sv.calculateInterest();
    }
}