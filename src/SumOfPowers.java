import java.util.Scanner;

public class SumOfPowers {

    private static double sumOfPowers(int base, int n) {
        if (n == 0) {
            return 1; // Base case: Any number raised to the power of 0 is 1
        } else {
            return Math.pow(base, n) + sumOfPowers(base, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base: ");
        int base = scanner.nextInt();

        System.out.println("Enter the number of powers: ");
        int n = scanner.nextInt();

        double result = sumOfPowers(base, n);
        System.out.println("Sum of the first " + n + " powers of base " + base + " is: " + result);
    }
}
