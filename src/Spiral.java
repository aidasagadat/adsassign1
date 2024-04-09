import java.util.Scanner;

public class Spiral{

    private static void fillSpiral(int[][] square, int num, int startRow, int endRow, int startCol, int endCol) {
        if (startRow > endRow || startCol > endCol) {
            return;
        }

        // Fill top row
        for (int i = startCol; i <= endCol; i++) {
            square[startRow][i] = num++;
        }

        // Fill right column
        for (int i = startRow + 1; i <= endRow; i++) {
            square[i][endCol] = num++;
        }

        // Fill bottom row
        for (int i = endCol - 1; i >= startCol; i--) {
            square[endRow][i] = num++;
        }

        // Fill left column
        for (int i = endRow - 1; i > startRow; i--) {
            square[i][startCol] = num++;
        }

        // Recursive call for the inner square
        fillSpiral(square, num, startRow + 1, endRow - 1, startCol + 1, endCol - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the square:");
        int N = scanner.nextInt();

        int[][] square = new int[N][N];
        fillSpiral(square, 1, 0, N - 1, 0, N - 1);

        System.out.println("Spiral Square:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
