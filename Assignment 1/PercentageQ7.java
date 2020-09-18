import java.util.Scanner;
class PercentageQ7{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Marks of 5 Subject");
	float m1 = sc.nextFloat();
	float m2 = sc.nextFloat();
	float m3 = sc.nextFloat();
	float m4 = sc.nextFloat();
	float m5 = sc.nextFloat();
	
	float Total = m1 + m2 + m3 + m4 + m5;
	System.out.println(Total);
	float percentage = (Total/500) * 100;
	
	System.out.println("percentage = "+percentage+"%");

	}
}