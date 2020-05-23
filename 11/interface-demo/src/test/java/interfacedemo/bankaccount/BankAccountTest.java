package interfacedemo.bankaccount;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void testCreateSavingsAccount() {
        BankAccount a;
        a = new SavingsAccount(10, "Hasan", 500);
        System.out.println(a);
        a.withdraw(10);
        System.out.println(a);
    }

    @Test
    public void testCreateCurrentAccount() {
        CurrentAccount a;
        a = new CurrentAccount(10, "Hasan", 500);
        System.out.println(a);
        a.deposit(5);
        a.withdraw(10);
        System.out.println(a);
    }
}
