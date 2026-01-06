import java.util.Scanner;

public class Bankaccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Account Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Withdrawal Amount: ");
        int n = sc.nextInt();

        // Fixed account details
        int accountNumber = 7410852;
        int balance = 5000;

        // Account number validation
        if (a != accountNumber) {
            System.out.println("Invalid Account Number");
        } else {
            System.out.println("Valid Account Number");

            // Balance validation
            if (n > balance) {
                System.out.println("Invalid Balance (Insufficient Funds)");
            } else {
                System.out.println("Sufficient Funds");
                balance = balance - n;
                System.out.println("Remaining Balance: " + balance);
            }
        }

        sc.close();
    }
}
