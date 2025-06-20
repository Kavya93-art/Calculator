import java.util.ArrayList;
class removeprimenum{
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,};
		ArrayList <Integer> arrlist=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(!isprime(arr[i])){
				arrlist.add(arr[i]);
			}
		}
		System.out.println(arrlist);
	}
	public static boolean isprime(int a){
		for(int i=2;i<=a/2;i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
	}
}

		