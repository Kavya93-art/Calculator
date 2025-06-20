import java.util.ArrayList;
class arraylistfunctions{
	public static void main(String[] args){
		ArrayList <Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		if(arr.isEmpty()){
			System.out.println("Array List is empty");
		}
		else{
			System.out.println("Array List is not empty");
		}
		System.out.println("Size of array list:" + arr.size());
		if(arr.contains(5)){
			System.out.println("Arraylist contains 5");
		}
		else{
			System.out.println("Arraylist not contains 5");

		}
		arr.remove(2);
		System.out.println(arr);
	}
}			


		