import java.util.Scanner;

public class StringPermutations{

    private static void generatePermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, prefix + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = scanner.next();

        generatePermutations(str, "");

        scanner.close();
    }
}

