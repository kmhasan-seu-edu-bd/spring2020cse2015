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
public class FixedDepositTest {
    private final double EPS = 0.00001;
    
    public FixedDepositTest() {
    }

    @Test
    public void testWithdraw() {
        FixedDeposit fixedDeposit = new FixedDeposit(3354, "Jane Doe", 2_00_000, 90);
        fixedDeposit.withdraw(1_00_000);
        Assertions.assertEquals(99_900, fixedDeposit.getBalance(), EPS);
    }

    @Test
    public void testWithdrawNegativeAmount() {
        FixedDeposit fixedDeposit = new FixedDeposit(3354, "Jane Doe", 2_00_000, 90);
        fixedDeposit.withdraw(-1_00_000);
        Assertions.assertEquals(2_00_000, fixedDeposit.getBalance(), EPS);
    }

    @Test
    public void testWithdrawOverDraft() {
        FixedDeposit fixedDeposit = new FixedDeposit(3354, "Jane Doe", 2_00_000, 90);
        fixedDeposit.withdraw(3_00_000);
        Assertions.assertEquals(2_00_000, fixedDeposit.getBalance(), EPS);
    }

    @Test
    public void testWithdrawOverHaveEnoughToCoverWithdrawFee() {
        FixedDeposit fixedDeposit = new FixedDeposit(3354, "Jane Doe", 2_00_000, 90);
        fixedDeposit.withdraw(1_99_990);
        Assertions.assertEquals(2_00_000, fixedDeposit.getBalance(), EPS);
    }

    @Test
    public void testDepositOneLacTaka() {
        FixedDeposit fixedDeposit = new FixedDeposit(3354, "Jane Doe", 2_00_000, 90);
        fixedDeposit.deposit(1_00_000);
        double newBalance = 2_00_000 + 1_00_000;
        newBalance = newBalance * 1.05;
        Assertions.assertEquals(newBalance, fixedDeposit.getBalance(), EPS);
    }

    @Test
    public void testDepositNegativeAmount() {
        FixedDeposit fixedDeposit = new FixedDeposit(3354, "Jane Doe", 2_00_000, 90);
        fixedDeposit.deposit(-1_00_000);
        Assertions.assertEquals(2_00_000, fixedDeposit.getBalance(), EPS);
    }

    @Test
    public void testDepositNinetyNineThousandTaka() {
        FixedDeposit fixedDeposit = new FixedDeposit(3354, "Jane Doe", 2_00_000, 90);
        fixedDeposit.deposit(99_000);
        double newBalance = 2_00_000;
        Assertions.assertEquals(newBalance, fixedDeposit.getBalance(), EPS);
    }

    @Test
    public void testDepositFiveLacTaka() {
        FixedDeposit fixedDeposit = new FixedDeposit(3354, "Jane Doe", 2_00_000, 90);
        fixedDeposit.deposit(5_00_000);
        double newBalance = 2_00_000 + 5_00_000;
        newBalance = newBalance * 1.05;
        Assertions.assertEquals(newBalance, fixedDeposit.getBalance(), EPS);
    }
    
    @Test
    public void testDepositFiveLacOneTaka() {
        FixedDeposit fixedDeposit = new FixedDeposit(3354, "Jane Doe", 2_00_000, 90);
        fixedDeposit.deposit(5_00_001);
        double newBalance = 2_00_000 + 5_00_001;
        newBalance = newBalance * 1.06;
        Assertions.assertEquals(newBalance, fixedDeposit.getBalance(), EPS);
    }
    
}






