/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eviro.assessment.grad001;



/**
 *
 * @author JMLekhase
 */
public class Account {

    private String technicalID;
    private String accountNum;
    private double balance;
    private double overdraft;

    public Account() {
        technicalID = "";
        accountNum = "";
        balance = 0.0;
        overdraft = 0.0;

    }

    public Account(String technicalID, String accountNum, double balance, double overdraft) throws IllegalArgumentException {
        setTechnicalID(technicalID);
        setAccountNum(accountNum);
        setBalance(balance);
        setOverdraft(overdraft);
        ;
    }

    public void setTechnicalID(String technicalID) {
        this.technicalID = technicalID;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(double balance) throws IllegalArgumentException {
        if (balance >= 1000) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("The Balance should be R1 000 and above");
        }
    }

    public void setOverdraft(double overdraft) throws IllegalArgumentException {
        if (overdraft <= 100000) {
            this.overdraft = overdraft;
        } else {
            throw new IllegalArgumentException("The Overdraft balance should not be more than R100 000");
        }

    }

    public String getTechnicalID() {
        return technicalID;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void withdrawal(double amount) {
        if (amount !=0) {
            this.balance = this.balance - amount; 
        }
       
    }
    
    public void deposit(double amount) {
        if (amount !=0) {
            this.balance = this.balance + amount; 
        }
       
    }

    public void currentAccountWithdrawal(double amountToWithdraw) {

        if (amountToWithdraw != 0) {
            this.overdraft = this.overdraft - amountToWithdraw;

        }

    }

    @Override
    public String toString() {
        return this.technicalID;
    }

}
