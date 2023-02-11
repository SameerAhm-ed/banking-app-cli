public class CheckingAccount extends Account {

    double feeChargedPerTransaction;
    public CheckingAccount(double balance, double feeAmt) {
        super(balance);
        this.accountBalance = balance;
        this.feeChargedPerTransaction = feeAmt;
    }

    @Override
    public double credit(double amt) {
        return super.credit(amt);
    }

    @Override
    public double debit(double amt) {
        if (accountBalance >= amt) {
            double feePerTransaction = 2;

            return accountBalance -= amt;
        } else {
            System.out.println("Debit amount exceeded account balance");
        }
        return accountBalance;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
