package interfacedemo.bankaccount;

public interface BankAccountOperations {
    void withdraw(double amount);
    default void deposit(double amount) {
        System.out.println("Someone called deposit!");
    }
}
