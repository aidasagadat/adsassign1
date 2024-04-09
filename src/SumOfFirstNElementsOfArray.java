import java.util.Scanner;

public class SumOfFirstNElementsOfArray {

    private static Integer sum = 0;

    private static Integer sumOfNElements(int[] array, Integer N){

        if(array.length == 0 || N == 0){
            return sum;
        }

        if(N == 1){
            return array[0];
        }

        if(N > 0){
            sum = sum + sumOfNElements(array, N - 1) + array[N-1];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        Integer arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter array elements(integers): ");
        for (int i = 0; i < arraySize; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter number of elements: ");
        Integer N = scanner.nextInt();

        Integer result = sumOfNElements(array, N);
        System.out.println(result);

    }

}
