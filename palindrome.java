public class palindrome{
	public static void main(String[] args){
		String a=new String("ABBA");
		StringBuilder s=new StringBuilder();
		for(int i=a.length()-1;i>=0;i--){
			s.append((a.charAt(i)));
		}
		if(s.toString().equals(a)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
	}
}