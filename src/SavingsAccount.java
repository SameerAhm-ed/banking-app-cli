public class SavingsAccount extends Account {
    double interestRate;


    public SavingsAccount(double balance, double inRate) {
        super(balance);
        this.interestRate = inRate;
        this.accountBalance = balance;
    }

    public double calculateInterest() {
        double intCal = (interestRate * accountBalance) / 100;
        System.out.println("Interest Calculation: " + intCal);
        double add = accountBalance + intCal;
        System.out.println("Balance After interest Add: " + add);
        accountBalance = add;
        return accountBalance;
    }

    @Override
    public double credit(double amt) {
        return super.credit(amt);
    }

    @Override
    public double debit(double amt) {
        return super.debit(amt);
    }
}
