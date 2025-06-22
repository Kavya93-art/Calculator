import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String a=sc.nextLine();
	String res="";
	res+=(a.charAt(0));
	for(int i=1;i<a.length();i++){
		if(a.charAt(i-1)!=a.charAt(i)){
			res+=a.charAt(i);
		}
	}
	System.out.println("Compressed String:"+res);
	}
}
		