import java.util.*;
public class compressstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String input=sc.nextLine();
        String result="";

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result+=input.charAt(i - 1);
                if (count > 1) {
                    result+=count;
                }
                count = 1;
            }
        }

        result+=input.charAt(input.length() - 1);
        if (count > 1) {
            result+=count;
        }

        System.out.println("Output: " + result);
    }
}
