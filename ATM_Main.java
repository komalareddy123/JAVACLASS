package javaclass2;

import java.util.Random;
import java.util.Scanner;

abstract class ATM { // parent class
    double balance; // initial balance

    ATM(double balance) { // parent constructor
        this.balance = balance;
    }

    abstract void withDraw(double amount);

    abstract void deposit(double amount);

    abstract void checkBal();
}

class Union extends ATM {
    Union(double balance) {
        super(balance);
    }

    // Body for withDraw method
    @Override
    void withDraw(double Amount) {
        if (Amount > 0 && Amount <= balance) {
            balance -= Amount;
            System.out.println("Withdraw Success: Available Balance: " + balance);
        } else {
            System.out.println("Not Available Balance");
        }
    }

    // Body for deposit method
    @Override
    void deposit(double Amount) {
        if (Amount > 0) {
            balance += Amount;
            System.out.println("Deposit Success: Available Balance: " + balance);
        } else {
            System.out.println("Deposit Failed");
        }
    }

    // Body for check balance method
    @Override
    void checkBal() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM_Main {

    // Method to generate a 4-digit PIN
    static int generatePIN() {
        Random rand = new Random();
        return 1000 + rand.nextInt(9000); // Generates a random 4-digit number
    }

    // Method to generate a 6-digit OTP
    static int generateOTP() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000); // Generates a random 6-digit number
    }

    public static void main(String[] args) {

        Union u = new Union(2000); // Initial balance of 2000
        Scanner s = new Scanner(System.in);

        // Generate and display the user's PIN for demonstration
        int pin = generatePIN();
        System.out.println("Your generated PIN is: " + pin);

        while (true) {
            System.out.println("\n******ATM MENU*******");
            System.out.println("---------------------");
            System.out.println("1. WITHDRAW MONEY");
            System.out.println("2. DEPOSIT MONEY");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. GENERATE OTP");
            System.out.println("5. EXIT");
            System.out.println("Enter your choice:");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Withdraw Amount:");
                    double with_amt = s.nextDouble();
                    u.withDraw(with_amt);
                    break;

                case 2:
                    System.out.println("Enter Deposit Amount:");
                    double dep_amt = s.nextDouble();
                    u.deposit(dep_amt);
                    break;

                case 3:
                    System.out.println("Available Balance:");
                    u.checkBal();
                    break;

                case 4:
                    int otp = generateOTP();
                    System.out.println("Your One-Time Password (OTP) is: " + otp);
                    break;

                case 5:
                    System.out.println("THANK YOU, VISIT AGAIN!");
                    System.exit(0);

                default:
                    System.out.println("Enter a Correct Option!");
            }
        }
    }
}
