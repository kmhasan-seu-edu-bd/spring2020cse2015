package interfacedemo.bankaccount;

public class CurrentAccount implements BankAccountOperations {
    private int id;
    private String name;
    private double balance;

    public CurrentAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount - 1;
    }
//
//    @Override
//    public void deposit(double amount) {
//        balance = balance + amount;
//    }
}
