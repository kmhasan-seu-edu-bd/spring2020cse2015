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
public class SavingsAccount extends BankAccount {
    private int withdrawCount;
    private int freeWithdrawCount;
    private double withdrawFine;
    
    public SavingsAccount(long id, String name, double balance) {
        super(id, name, balance);
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
}
