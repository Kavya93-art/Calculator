public class characterfrequency {
    public static void main(String[] args) {
        String str = "banana";
        int[] freq = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Repeating characters:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }
}
