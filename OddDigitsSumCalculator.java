import java.util.Scanner;

public class OddDigitsSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Initialize the sum of odd digits
        int sumOfOddDigits = 0;

        // Loop through each digit of the number
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sumOfOddDigits += digit;  // Add odd digit to the sum
            }
            number /= 10;  // Move to the next digit
        }

        // Output
        System.out.println("Sum of odd digits: " + sumOfOddDigits);

        // Closing the scanner
        sc.close();
    }
}