/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.bankaccountdemo;

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
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(1234, "John Doe", 1000);
        bankAccount.withdraw(200);
        Assertions.assertEquals(800, bankAccount.getBalance());
    }

    @Test
    public void testWithdrawNegativeAmount() {
        BankAccount bankAccount = new BankAccount(1234, "John Doe", 1000);
        bankAccount.withdraw(-200);
        Assertions.assertEquals(1000, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
    }

    @Test
    public void testGetBalance() {
        BankAccount bankAccount = new BankAccount(1234, "John Doe", 1000);
        Assertions.assertEquals(1000, bankAccount.getBalance());
    }
    
}
