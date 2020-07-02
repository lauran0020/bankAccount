package com.flexon.bankAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        final String accountNumber = "123456789";
        final double balance = 50.0;
        final String customerName = "Jason";
        final String email = "lauran.0020@gmail.com";
        final String phoneNumber = "9131231234";
        
        BankAccount bankAccount = new BankAccount(accountNumber,
                                  balance, customerName, email, phoneNumber);
        bankAccount.display();
    }
}
