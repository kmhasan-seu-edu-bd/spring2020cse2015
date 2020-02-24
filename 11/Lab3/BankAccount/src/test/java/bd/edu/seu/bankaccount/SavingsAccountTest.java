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
public class SavingsAccountTest {
    
    public SavingsAccountTest() {
    }

    @Test
    public void testWithdraw() {
        double EPS = 0.000000001;
        SavingsAccount savingsAccount = new SavingsAccount(1234, "John Doe", 1000);

        savingsAccount.withdraw(100);
        Assertions.assertEquals(900, savingsAccount.getBalance(), EPS);
        savingsAccount.withdraw(50);
        Assertions.assertEquals(850, savingsAccount.getBalance(), EPS);
        savingsAccount.withdraw(50);
        Assertions.assertEquals(800, savingsAccount.getBalance(), EPS);
        savingsAccount.withdraw(100);
        Assertions.assertEquals(690, savingsAccount.getBalance(), EPS);
        savingsAccount.withdraw(690);
        Assertions.assertEquals(690, savingsAccount.getBalance(), EPS);
        savingsAccount.withdraw(680);
        Assertions.assertEquals(0, savingsAccount.getBalance(), EPS);
    }

    @Test
    public void testDeposit() {
        SavingsAccount savingsAccount = new SavingsAccount(1234, "John Doe", 1000);
        savingsAccount.deposit(100);
        double EPS = 0.000000001;
        Assertions.assertEquals(1100, savingsAccount.getBalance(), EPS);
    }

    @Test
    public void testDepositNegativeAmount() {
        SavingsAccount savingsAccount = new SavingsAccount(1234, "John Doe", 1000);
        savingsAccount.deposit(-100);
        double EPS = 0.000000001;
        Assertions.assertEquals(1000, savingsAccount.getBalance(), EPS);
    }

    @Test
    public void testGetBalance() {
        SavingsAccount savingsAccount = new SavingsAccount(1234, "John Doe", 1000);
        double EPS = 0.000000001;
        Assertions.assertEquals(1000, savingsAccount.getBalance(), EPS);
    }
    
}
