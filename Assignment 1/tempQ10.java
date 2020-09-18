import java.util.Scanner;
class tempQ10{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Tempreture in Fahrenheigt");
	float f = sc.nextFloat();
	float c= 5*(f-32)/9;
	System.out.println("Tempreture in celsius is  "+c);
	}
}