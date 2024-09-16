package service;

import java.util.Scanner;
public class ContBank {
    private double balance;
    private int numAccount;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumAccount(){
        return numAccount;
    }

    public void setNumAccount(int num){
        this.numAccount = num;
    }

    public double depositValue(double value){
        try {
            if (value <= 0) {
                throw new IllegalArgumentException("Error! The entered value is 0 or a negative number!");
            }

            double bal = getBalance();
            bal += value;
            setBalance(bal);

            System.out.println("Deposit Successful. Current balance: " + bal);
            return bal;

        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
            return getBalance();
        }
    }

    public void printInformations(){

    }

}