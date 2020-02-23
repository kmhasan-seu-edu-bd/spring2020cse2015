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
public class CreditCardTest {
    
    public CreditCardTest() {
    }

    @Test
    public void testWithdraw() {
        double EPS = 0.00001;
        CreditCard card = new CreditCard(4532, "John Doe", 150000);
        
        card.withdraw(205);
        Assertions.assertEquals(-205, card.getBalance(), EPS);
        Assertions.assertEquals(150000, card.getLimit(), EPS);        

        card.withdraw(10000);
        Assertions.assertEquals(-10205, card.getBalance(), EPS);
        Assertions.assertEquals(150000, card.getLimit(), EPS);        

        card.withdraw(140000);
        Assertions.assertEquals(-10205, card.getBalance(), EPS);
        Assertions.assertEquals(150000, card.getLimit(), EPS);        
    }
    
    @Test
    public void testWithdrawNegativeAmount() {
        double EPS = 0.00001;
        CreditCard card = new CreditCard(4532, "John Doe", 150000);
        card.withdraw(-10000);
        Assertions.assertEquals(0, card.getBalance(), EPS);
        Assertions.assertEquals(150000, card.getLimit(), EPS);
    }

    
    @Test
    public void testDeposit() {
        double EPS = 0.00001;
        CreditCard card = new CreditCard(4532, "John Doe", 150000);
        card.deposit(10000);
        Assertions.assertEquals(10000, card.getBalance(), EPS);
        Assertions.assertEquals(150000, card.getLimit(), EPS);
    }

    @Test
    public void testDepositNegativeAmount() {
        double EPS = 0.00001;
        CreditCard card = new CreditCard(4532, "John Doe", 150000);
        card.deposit(-10000);
        Assertions.assertEquals(0, card.getBalance(), EPS);
        Assertions.assertEquals(150000, card.getLimit(), EPS);
    }

    @Test
    public void testGetBalance() {
        CreditCard card = new CreditCard(4532, "John Doe", 150000);
        double EPS = 0.00001;
        Assertions.assertEquals(0.0, card.getBalance(), EPS);
    }

    @Test
    public void testGetLimit() {
        CreditCard card = new CreditCard(4532, "John Doe", 150000);
        double EPS = 0.00001;
        Assertions.assertEquals(150000, card.getLimit(), EPS);
    }
    
}
