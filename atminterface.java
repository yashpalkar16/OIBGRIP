package com.atminterface;
import java.util.Scanner;

public class ATM {
  private static final int ACCOUNT_NUMBER = 12345;
  private static final int PIN = 1234;
  private static double balance = 1000.0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the ATM");
    System.out.println("Enter your account number: ");
    int accountNumber = scanner.nextInt();
    System.out.println("Enter your PIN: ");
    int pin = scanner.nextInt();

    if (accountNumber == ACCOUNT_NUMBER && pin == PIN) {
      System.out.println("Access granted. What would you like to do?");

      int option = 0;
      while (option != 4) {
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Quit");
        System.out.println("Enter an option: ");
        option = scanner.nextInt();

        switch (option) {
          case 1:
            System.out.println("Your balance is $" + balance);
            break;
          case 2:
            System.out.println("Enter the amount to withdraw: ");
            double withdrawalAmount = scanner.nextDouble();
            if (withdrawalAmount > balance) {
              System.out.println("Insufficient funds.");
            } else {
              balance -= withdrawalAmount;
              System.out.println("Withdrawal successful. Your new balance is $" + balance);
            }
            break;
          case 3:
            System.out.println("Enter the amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            balance += depositAmount;
            System.out.println("Deposit successful. Your new balance is $" + balance);
            break;
          case 4:
            System.out.println("Thank you for using the ATM. Goodbye!");
            break;
          default:
            System.out.println("Invalid option. Please try again.");
        }
      }
    } else {
      System.out.println("Access denied. Incorrect account number or PIN.");
    }
  }
}
