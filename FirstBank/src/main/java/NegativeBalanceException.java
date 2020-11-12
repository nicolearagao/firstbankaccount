/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */
public class NegativeBalanceException extends Exception {
    
    private double amount;
    private double balance;

    public NegativeBalanceException(double amount, double balance) {
        this.amount = amount;
        this.balance = balance;
    }
    
    
   
    public double getAmount(){
        return this.amount;
    }
    
    public double getBalance(){
        return this.balance;
    }
}
