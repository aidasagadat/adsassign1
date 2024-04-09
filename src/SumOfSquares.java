import java.util.Scanner;

public class SumOfSquares {

    private static Integer sum = 0;

    public static Integer sumOfSquares(Integer number){
        if(number == 0){
            return sum;
        }
        if(number > 0){
            sum = sum + number*number;
            return sumOfSquares(number-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        Integer number = scanner.nextInt();
        System.out.println(sumOfSquares(number));
    }

}
