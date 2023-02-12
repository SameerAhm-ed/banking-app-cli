import java.util.Scanner;

public class Account implements IAccount{
    protected double accountBalance;

    public Account(double balance) {

        if (accountBalance < 0.0) {
            System.out.println("Initial Balance was invalid");
            accountBalance = 0.0;
        } else {
            this.accountBalance = balance;
        }
    }

    @Override
    public double credit(double amt) {
        return accountBalance += amt;
    }

    @Override
    public double debit(double amt) {
        if (accountBalance >= amt) {
            return accountBalance -= amt;
        } else {
            System.out.println("Debit amount exceeded account balance");
        }
        return accountBalance;
    }

    @Override
    public double getBalance() {
        return accountBalance;
    }
}
