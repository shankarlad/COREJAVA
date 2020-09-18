import java.util.Scanner;
class SalaryCalcQ12{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Salary of Employee");
	double salary = sc.nextFloat();

	double tsal;
	if (salary < 10000) {
		double HRA = salary * 0.10;
		double DA = salary * 0.90;
		tsal = salary + HRA + DA;
		System.out.println("Total Salary of Employee is "+tsal);
	} else if (salary >= 10000){
		double HRA=2000;
		double DA = salary * 0.98;
		tsal = salary + HRA + DA;
		System.out.println("Total Salary of Employee is "+tsal);
	}
	
	}
}