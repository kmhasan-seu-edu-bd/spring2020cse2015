package interfacedemo.bankaccount;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(int id, String name, double balance) {
        super(id, name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount + 1;
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount - 5;
    }
}
