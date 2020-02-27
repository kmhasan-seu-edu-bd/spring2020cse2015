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
public class CurrentAccountTest {
    private double EPS = 0.000001;
    
    public CurrentAccountTest() {
    }

    @Test
    public void testDeposit() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        account.deposit(1000);
        Assertions.assertEquals(2000, account.getBalance(), EPS);
    }

    @Test
    public void testDepositTenThousand() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        account.deposit(10000);
        Assertions.assertEquals(11000, account.getBalance(), EPS);
    }

    @Test
    public void testDepositMoreThanTenThousand() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        account.deposit(10001);
        Assertions.assertEquals(11002, account.getBalance(), EPS);
    }

    @Test
    public void testDepositNegative() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        account.deposit(-10000);
        Assertions.assertEquals(1000, account.getBalance(), EPS);
    }

    @Test
    public void testWithdraw() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        account.withdraw(600);
        Assertions.assertEquals(390, account.getBalance(), EPS);
    }
    
    @Test
    public void testWithdrawNegativeAmount() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        account.withdraw(-600);
        Assertions.assertEquals(1000, account.getBalance(), EPS);
    }
    
    @Test
    public void testWithdrawMoreThanBalance() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        account.withdraw(2000);
        Assertions.assertEquals(1000, account.getBalance(), EPS);
    }
    
    @Test
    public void testWithdrawFullBalance() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        account.withdraw(1000);
        Assertions.assertEquals(1000, account.getBalance(), EPS);
    }
    
    @Test
    public void testWithdrawNineTakaLessThanBalance() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        account.withdraw(1000 - 9);
        Assertions.assertEquals(1000, account.getBalance(), EPS);
    }
    
    @Test
    public void testWithdrawTwentyTimes() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        for (int i = 0; i < 20; i++) {
            account.withdraw(10);
        }
        Assertions.assertEquals(600, account.getBalance(), EPS);
    }
    
    @Test
    public void testWithdrawTwentyOneTimes() {
        CurrentAccount account = new CurrentAccount(5475, "Ashiqur Rahman", 1000);
        for (int i = 0; i < 21; i++) {
            account.withdraw(10);
        }
        Assertions.assertEquals(579, account.getBalance(), EPS);
    }
    
}







