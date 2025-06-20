import java.util.Scanner;

public class arithmeticexception {
    public static void main(String[] args) {
        check();
    }

    public static void check() {
        int[] arr = {10, 11, 13, 0, 5};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            try {
                int res = division(n, arr[i]);
                System.out.println(res);
            } catch (ArithmeticException e) {
                e.printStackTrace(); 
            }
        }
    }

    public static int division(int n, int num1) throws Exception {
        if (num1 == 0) {
            throw new ArithmeticException("Value is zero");
        }
        return n / num1;
    }
}
