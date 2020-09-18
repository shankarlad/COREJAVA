import java.util.Scanner;
class SIQ8{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Principle amount");
	float pa = sc.nextFloat();
	System.out.println("Enter the Rate of Interest");
	float r = sc.nextFloat();
	System.out.println("Enter the time");
	float N = sc.nextFloat();
	
	float SI = (pa * r * N)/100;
	System.out.println(SI);

	}
}