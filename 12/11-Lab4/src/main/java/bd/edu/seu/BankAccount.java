package bd.edu.seu;

public class BankAccount {
    private int id;
    private String name;
    private String address;
    private double balance;

    public BankAccount(int id, String name, String address, double balance) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance = balance - amount;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance = balance + amount;
    }

    public String toString() {
        return String.format("(%d, %s, %.2f)", id, name, balance);
    }


}






