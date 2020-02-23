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
public class SavingsAccountOld {
    private long id;
    private String name;
    private double balance;
    private int withdrawCount;
    private int freeWithdrawCount;
    private double withdrawFine;
    
    public SavingsAccountOld(long id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.withdrawCount = 0;
        this.freeWithdrawCount = 3;
        this.withdrawFine = 10;
    }
    
    public void withdraw(double amount) {
        // Crappy piece of code
        if (amount > 0 && amount <= balance) {
            if (withdrawCount < freeWithdrawCount)
                balance = balance - amount;
            else {
                if (amount + withdrawFine <= balance)
                    balance = balance - amount - withdrawFine;
            }
            withdrawCount = withdrawCount + 1;
        }
    }
    
    public void deposit(double amount) {
        if (amount > 0)
            balance = balance + amount;
    }
    
    public double getBalance() {
        return balance;
    }
}









