/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.bankaccountdemo;

/**
 *
 * @author seu
 */
public class CreditCard extends BankAccount {
    private double limit;
    
    public CreditCard(long id, String name, double limit) {
        super(id, name, 0);
        this.limit = limit;
    }

    public void withdraw(double amount) {
        if (amount >= 0 && -(balance - amount) <= limit)
            balance = balance - amount;
    }
    
    public double getLimit() {
        return limit;
    }    
}
