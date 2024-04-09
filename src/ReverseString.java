import java.util.Scanner;

public class ReverseString {

    private static void displayReversedSequence(Scanner scanner, int N) {
        if (N > 0) {
            char[] str = scanner.next().toCharArray();
            displayReversedSequence(scanner, N - 1);
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings in the sequence:");
        int N = scanner.nextInt();

        System.out.println("Enter the strings:");
        displayReversedSequence(scanner, N);

        scanner.close();
    }
}
