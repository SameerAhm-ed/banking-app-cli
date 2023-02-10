public class Account implements IAccount{

    double accountBalance;

    public Account(double balance) {
        this.accountBalance = balance;

        if (accountBalance < 0.0) {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public double credit() {
        return 0;
    }

    @Override
    public double debit() {
        return 0;
    }

    @Override
    public double getBalance() {
        return 0;
    }
}
