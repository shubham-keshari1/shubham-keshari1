import java.util.Scanner;

public class HighestNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 5;

        // Input
        System.out.println("Enter " + count + " integer numbers:");

        int highestNumber = Integer.MIN_VALUE;  // Initialize with the smallest possible integer value

        // Loop to take input and find the highest number
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();

            if (number > highestNumber) {
                highestNumber = number;
            }
        }

        // Output
        System.out.println("The highest number among the entered " + count + " numbers is: " + highestNumber);

        // Closing the scanner
        sc.close();
    }
}