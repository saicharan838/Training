import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System. in);

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Error: Invalid operator entered.");
                    return;
            }

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            sc.close();
        }
    }
}
