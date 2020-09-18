import java.util.Scanner;
class EligibleQ15{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Gender and age");
	char gender = sc.next().charAt(0);
	int age = sc.nextInt();

	if( gender == 'm' && age > 21){
		System.out.println("Boy is Eligible for marriage");	
	}else if (gender == 'f' && age > 18){
		System.out.println("Girl is Eligible for marriage");
	}else {
		System.out.println("Not Eligible for marriage");
	}

	}
}