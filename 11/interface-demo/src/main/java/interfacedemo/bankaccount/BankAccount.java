package interfacedemo.bankaccount;

public abstract class BankAccount {
    private int id;
    private String name;
    protected double balance;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public abstract void withdraw(double amount);
}
