import java.util.Scanner;

class TableQ16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int i = 1;
		System.out.println("Table of "+num+" is:");
		while(i <= 10){
			
			System.out.println(num+" x "+i+" = "+num*i);
			i++;
			
			
		}
	}
	
}