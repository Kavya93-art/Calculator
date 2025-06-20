import java.util.Scanner;
public class nullpointerexception{
	public static void main(String [] args){
		check();
	}
	public static void check(){
		Integer [] arr={1,2,4,null,6};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to divide:");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			try{
				int res=division(n,arr[i]);
				System.out.println(res);
			}
			catch(NullPointerException e){
				e.printStackTrace();
			}
		}
	}
	public static int division(int num,Integer num1) throws NullPointerException{
		if(num1== null){
			throw new NullPointerException("Values is null");
		}
		return num/num1;
	}

}