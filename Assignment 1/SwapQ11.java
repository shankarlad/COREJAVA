import java.util.Scanner;
class SwapQ11{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the two numbers to swap");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Before Swaping a = "+a+" and b = "+b);
	a = a + b;
	b = a - b;
	a = a - b;	
	System.out.println("After Swaping a = "+a+" and b = "+b);
	}
}