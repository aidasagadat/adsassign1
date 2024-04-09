import java.util.Scanner;

public class SumOfPositiveNElementsOfArr {

    private static int sumOfNPositiveElements(int[] array, int n) {
        if (n <= 0 || array.length == 0) {
            return 0;
        }

        if (array[n - 1] > 0) {
            return array[n - 1] + sumOfNPositiveElements(array, n - 1);
        } else {
            return sumOfNPositiveElements(array, n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter array elements (integers): ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter number of elements: ");
        int n = scanner.nextInt();

        int result = sumOfNPositiveElements(array, n);
        System.out.println(result);

    }
}

