package com.fxw.fxwlongtermstudy.bank;

import java.util.Scanner;

/**
 * @author tony fan
 */
public class Account {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;

    public Account(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(int amount){
        if(amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount != 0){
            balance -= amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited:" + previousTransaction);
        } else if (previousTransaction < 0){
            System.out.println("WithDrawn:" + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    void calculateInterest(int years){
        double interestRate = .0185;
        double newBalance = interestRate * years * balance + balance;
        System.out.println("The current interest rate is " + 100 * interestRate);
        System.out.println("After " + years + " years,you balance will be : " + newBalance);
    }

    void showMenu(){
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!" + customerName + "!");
        System.out.println("Your ID is : " + customerId);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A Check your balance");
        System.out.println("B Make a deposit");
        System.out.println("C Make a withdrawal");
        System.out.println("D View previous transaction");
        System.out.println("E Calculate interest");
        System.out.println("F Exit");
        do {
            System.out.println();
            System.out.println("Enter your option:");
            char option1 = sc.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option){
                case 'A':
                    System.out.println("==========================");
                    System.out.println("Balance = $" + balance);
                    System.out.println("==========================");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("Enter an amount to deposit:");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("Enter an amount to withdraw:");
                    int amount1 = sc.nextInt();
                    withdraw(amount1);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("==========================");
                    getPreviousTransaction();
                    System.out.println("==========================");
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("Enter how many years of accrued interest:");
                    int years = sc.nextInt();
                    calculateInterest(years);
                    break;
                case 'F':
                    System.out.println("==========================");
                    break;
                default:
                    System.out.println("Error:invalid option.Please enter A,B,C,D,E,F.");
            }
        } while (option != 'F');
        System.out.println("Thank you for banking with us");
    }

}
