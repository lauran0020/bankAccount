package com.flexon.bankAccount;

class Funcs{
    String accountNumber;
    double balance;
    String customerName;
    String email; 
    String phoneNumber;

    public Funcs(String accountNumber, double balance, 
                String customerName, String email, 
                String phoneNumber) {
                    this.accountNumber = accountNumber;
                    this.balance = balance;
                    this.customerName = customerName;
                    this.email = email;
                    this.phoneNumber = phoneNumber;
                }


    // creates methods
    public double deposit(double balance, double amount) {
        balance += amount;
        System.out.println("Customer Name: " + customerName);
        System.out.println("New Balance: " + balance);

        return balance;
    }

    public double withdraw(double amount, double curBalance) {
        balance -= amount;
        System.out.println("Customer Nanem: " + customerName);
        System.out.println("New Balance: " + balance);
        return balance;
    }

    public void printInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
