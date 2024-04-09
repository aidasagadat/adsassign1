public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(5));
        System.out.println(isPowerOfTwo(10));
    }


}


