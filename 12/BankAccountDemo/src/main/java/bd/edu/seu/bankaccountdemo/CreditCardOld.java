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
public class CreditCardOld {
    private long number;
    private String name;
    private double balance;
    private double limit;
    
    public CreditCardOld(long number, String name, double limit) {
        this.number = number;
        this.name = name;
        this.balance = 0;
        this.limit = limit;
    }
    
    public void withdraw(double amount) {
        if (amount >= 0 && -(balance - amount) <= limit)
            balance = balance - amount;
    }
    
    public void deposit(double amount) {
        if (amount >= 0)
            balance = balance + amount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double getLimit() {
        return limit;
    }
}












