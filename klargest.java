import java.util.PriorityQueue;
import java.util.Scanner;

class klargest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 11, 5};
        System.out.println("Enter the k to find the largest:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);  

       	    if (pq.size() > k) {
                pq.poll();            }
        }
        System.out.println(k + " largest number: " + pq.peek());
    }
}
	