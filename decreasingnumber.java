import java.util.Scanner;

public class decreasingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printReverse(n);
    }

    public static void printReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printReverse(n - 1);
    }
}
