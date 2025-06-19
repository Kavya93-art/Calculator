public class reverse{
	public static void main(String[] args){
		String a=new String("ABCD");
		StringBuilder s=new StringBuilder();
		for(int i=a.length()-1;i>=0;i--){
			s.append((a.charAt(i)));
		}
		System.out.println(s);
	}
}