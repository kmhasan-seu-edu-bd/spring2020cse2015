/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.bankaccount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author seu
 */
public class BankAccountTest {
    
    public BankAccountTest() {
    }

    @Test
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(123, "John Doe", 1000);
        bankAccount.deposit(100);
        Assertions.assertEquals(1100, bankAccount.getBalance());
    }

    @Test
    public void testDepositNegativeAmount() {
        BankAccount bankAccount = new BankAccount(123, "John Doe", 1000);
        bankAccount.deposit(-100);
        Assertions.assertEquals(1000, bankAccount.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(123, "John Doe", 1000);
        bankAccount.withdraw(100);
        Assertions.assertEquals(900, bankAccount.getBalance());
    }

    @Test
    public void testWithdrawOverDraft() {
        BankAccount bankAccount = new BankAccount(123, "John Doe", 1000);
        bankAccount.withdraw(2000);
        Assertions.assertEquals(1000, bankAccount.getBalance());
    }

    @Test
    public void testWithdrawNegativeAmount() {
        BankAccount bankAccount = new BankAccount(123, "John Doe", 1000);
        bankAccount.withdraw(-100);
        Assertions.assertEquals(1000, bankAccount.getBalance());
    }

    @Test
    public void testGetBalance() {
        BankAccount bankAccount = new BankAccount(123, "John Doe", 1000);
        Assertions.assertEquals(1000, bankAccount.getBalance());
    }
    
}
