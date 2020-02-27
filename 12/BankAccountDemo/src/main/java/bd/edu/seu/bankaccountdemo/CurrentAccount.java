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
public class CurrentAccount extends BankAccount {
    private int numberOfWithdraws;
    
    public CurrentAccount(long number,
            String name, 
            double balance) {
        super(number, name, balance);
        numberOfWithdraws = 0;
    }

    @Override
    public void deposit(double amount) {
        if (amount >= 0) {
            balance = balance + amount;
            if (amount > 10_000)
                balance = balance + 1;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount + getServiceCharge() <= balance) {
            balance = balance - amount - getServiceCharge();
//            balance = balance - amount - (numberOfWithdraws < 20 ? 10 : 11);
            numberOfWithdraws++;
        }
    }
    
    public double getServiceCharge() {
        if (numberOfWithdraws < 20)
            return 10;
        else return 11;
    }
    
}












