package UPI;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Payment p = new Payment();

        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                p.upiPayment();
                break;
            case 2:
                p.creditCardPayment();
                break;
            case 3:
                p.debitCardPayment();
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
