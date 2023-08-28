import java.util.Scanner;

public class LCMfinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// User input for first number 
        System.out.print("Enter the first positive integer: ");
        int num1 = sc.nextInt();
// User input for second number 
        System.out.print("Enter the second positive integer: ");
        int num2 = sc.nextInt();

        int gcd = 1;
//If else Syntex 
        int smaller = (num1 < num2) ? num1 : num2;
//Loops from i=1 to less then smaller number 
        for (int i = 1; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        int lcm = (num1 * num2) / gcd;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

}