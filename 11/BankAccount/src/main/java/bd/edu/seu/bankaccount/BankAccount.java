/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.bankaccount;

/**
 *
 * @author seu
 */
public class BankAccount {
    private long number;
    private String name;
    protected double balance;
    
    public BankAccount(long number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount >= 0)
            balance = balance + amount;
    }
    
    public void withdraw(double amount) {
        if (amount >= 0 && amount <= balance)
            balance = balance - amount;
    }
    
    public double getBalance() {
        return balance;
    }
}








