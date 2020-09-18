import java.util.Scanner;
class yearsQ9{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the count of days");
	int days = sc.nextInt();
	
	int year = days/365;
	days = days % 365;
	System.out.println("Years "+year);
	
	int month = days/30;
	days = days % 30;
	System.out.println("Months "+month);
	System.out.println("Days "+days);
	
	}
}