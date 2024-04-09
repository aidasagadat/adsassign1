import java.util.Scanner;

public class ReverseSequences {

    private static void displayReversedSequence(Scanner scanner, int N) {
        if (N > 0) {
            int num = scanner.nextInt();
            displayReversedSequence(scanner, N - 1);
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the sequence:");
        int N = scanner.nextInt();

        System.out.println("Enter the sequence:");
        displayReversedSequence(scanner, N);

        scanner.close();
    }
}
