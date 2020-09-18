import java.util.Scanner;
class AreaQ6{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	float pie = 3.14f;
	
	System.out.println("Enter the Radius Of Circle");
	float r = sc.nextFloat();

	float area = pie*r*r;
	float cf = 2*pie*r;
	
	System.out.println("Area of circle "+area);
	System.out.println("circumference  of circle "+cf);	

	}
}