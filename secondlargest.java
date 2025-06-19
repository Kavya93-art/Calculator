import java.util.Arrays;
public class secondlargest{
	public static void main(String[] args){
		int arr[]={1,3,5,7,9,2};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}
}