import java.util.Scanner;

class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1:");
	int n1=sc.nextInt();
        System.out.println("Enter number2:");
	int n2=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter operation:");
        char n=sc.nextLine().charAt(0);
	int r=0;
        switch(n){
        case '+':
	    r=n1+n2;
            System.out.println("Addition:"+r);
            break;
        case '-':
	    r=n1-n2;
            System.out.println("Subtraction:"+r);
            break;
        case '*':
	    r=n1*n2;
            System.out.println("Multiplication:"+r);
            break;
        case '/':
	    if(n2!=0 && n1!=0){
		r=n1/n2;
		System.out.println("Division:"+r);

	    }
	    else{
            System.out.println("Cannot divide by zero");
	    }
            break;
  
        default:
        System.out.println("Invalid!!");
        }
    }
}
