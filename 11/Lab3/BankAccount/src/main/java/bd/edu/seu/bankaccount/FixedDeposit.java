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
public class FixedDeposit extends BankAccount {
    private int numberOfMonths;
    private double withdrawFine;
    
    public FixedDeposit(long number,
            String name,
            double balance,
            int numberOfMonths) {
        super(number, name, balance);
        this.numberOfMonths = numberOfMonths;
        this.withdrawFine = 100;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount + withdrawFine <= balance)
            balance = balance - amount - withdrawFine;
    }
    
    public void deposit(double amount) {
        if (amount >= 1_00_000) {
            balance = balance + amount;
            if (amount <= 5_00_000)
                balance = balance * 1.05;
            else balance = balance * 1.06;
        }
    }
}









