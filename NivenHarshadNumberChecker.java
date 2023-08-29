import java.util.Scanner;

public class NivenHarshadNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Make a copy of the original number to calculate the sum of digits
        int originalNumber = number;
        
        // Initialize the sum of digits
        int sumOfDigits = 0;

        // Calculate the sum of digits
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        // Check if the original number is divisible by the sum of digits
        if (originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Niven or Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Niven or Harshad Number.");
        }

        // Closing the scanner
        sc.close();
    }
}