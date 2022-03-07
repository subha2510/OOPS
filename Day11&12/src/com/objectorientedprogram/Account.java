package com.objectorientedprogram;

import java.util.Scanner;

public class Account {
    double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public void debitMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount for debit thorugh account:");
        int debitAmount = sc.nextInt();
        if (debitAmount < balance) {
            balance -= debitAmount;
            System.out.println("Debit amount is : " + debitAmount);
            System.out.println("Account balance after update : " + balance);
        } else {
            System.out.println("Debit amount exceeded Account balance");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account balance : ");
        Account account = new Account(sc.nextDouble());
        account.debitMethod();
    }
}
