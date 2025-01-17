import java.util.Scanner;

public class SubtractionProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the difference
        double difference = num1 - num2;

        // Display the result
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

        // Close the scanner
        scanner.close();
    }
}
