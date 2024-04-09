import java.util.Scanner;

public class GenerateSequence {

    private static void generateSequences(int[] sequence, int index, int n, int k) {
        if (index == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            sequence[index] = i;
            generateSequences(sequence, index + 1, n, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of sequences (n):");
        int n = scanner.nextInt();

        System.out.println("Enter the upper limit (k):");
        int k = scanner.nextInt();

        int[] sequence = new int[n];
        generateSequences(sequence, 0, n, k);

        scanner.close();
    }
}
