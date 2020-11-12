/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */
public class Account {

    private double balance;
    private double previousTransaction;
    private String customerName;
    private String customerId;

    public Account(String name, String id) {
        this.customerName = name;
        this.customerId = id;
        this.balance = 0.0;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }
    //deposit money

    
    public double getBalance(){
        return balance;
    }
    
    public double getPreviousTRansaction(){
        return previousTransaction;
    }
    
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //withdraw money
    public void withdraw(double amount) throws NegativeBalanceException {
        if (balance < amount) {
            throw new NegativeBalanceException(amount, balance);
        }

        this.balance = this.balance - amount;
        previousTransaction = -amount;
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction ocurred.");
        }
    }

    public void calculateInterest(int years) {
        double interesteRateSavings = 0.05;
        double newBalance = balance + (balance * interesteRateSavings * years);
        System.out.println("After " + years + " years, your new balance will be:" + newBalance);

    }
}
