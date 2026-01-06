import java.util.Scanner;

public class RealWorldApllications {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Real World Applications -----");
        System.out.println("1. Voting Age Check");
        System.out.println("2. Loan Eligibility Check");
        System.out.println("3. Traffic Light System");
        System.out.print("Enter your choice (1-3): ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                // Voting Age Check
                System.out.print("Enter age: ");
                int age = sc.nextInt();

                if (age >= 18) {
                    System.out.println("Eligible to vote");
                } else {
                    System.out.println("Not eligible to vote");
                }
                break;

            case 2:
                // Loan Eligibility
                System.out.print("Enter age: ");
                int loanAge = sc.nextInt();

                System.out.print("Enter monthly income: ");
                int income = sc.nextInt();

                System.out.print("Enter credit score: ");
                int creditScore = sc.nextInt();

                if (loanAge >= 21 && income >= 25000 && creditScore >= 650) {
                    System.out.println("Loan Approved");
                } else {
                    System.out.println("Loan Rejected");
                }
                break;

            case 3:
                // Traffic Light System
                System.out.println("Traffic Light System Started (Press Ctrl+C to stop)");
                while (true) {
                    System.out.println("RED - Stop");
                    Thread.sleep(3000);

                    System.out.println("GREEN - Go");
                    Thread.sleep(3000);

                    System.out.println("YELLOW - Get Ready");
                    Thread.sleep(2000);
                }

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
