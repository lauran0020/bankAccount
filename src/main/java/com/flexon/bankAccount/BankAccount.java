package com.flexon.bankAccount;

import java.util.Scanner;  // Import the Scanner class
 
class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double balance, 
                       String customerName, String email,
                       String phoneNumber) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which function would you like to use?");
        System.out.println("Show Account Balance[A]");
        System.out.println("Deposit Money[B]");
        System.out.println("Withdraw Money[C]");
        System.out.println("Exit[D]");
        String option = scanner.nextLine();

        Funcs funcs = new Funcs(accountNumber, balance, customerName, email, phoneNumber);
        switch (option) {
            case "A":
                System.out.println("Account Balance: " + balance);
                break;

            case "B":
                System.out.println("Input the amount:");
                String dAmount = scanner.nextLine();
                Double dAmount_ = Double.valueOf(dAmount);
                while (dAmount_ <= 0 ) {
                    System.out.println("Please input a positive number");
                    dAmount = scanner.nextLine();
                    dAmount_ = Double.valueOf(dAmount);
                }
                balance = funcs.deposit(balance, dAmount_);
                break;

            case "C":
                System.out.println("Input the amount:");
                String wAmount = scanner.nextLine();
                Double wAmount_ = Double.valueOf(wAmount);
                while (wAmount_ <= 0 || wAmount_ > balance) {
                    System.out.println("Please input amount between 0 and your current balance " + balance);
                    wAmount = scanner.nextLine();
                    wAmount_ = Double.valueOf(wAmount);
                }
                balance = funcs.withdraw(wAmount_, balance);
                break;
            
            case "D":
                System.out.println("You've exited.");
                break;

            default:
                System.out.println("Please choose a function in above.");
                display();

        scanner.close();
        }
    }
    
}