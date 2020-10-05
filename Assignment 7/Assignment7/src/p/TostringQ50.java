package p;

import java.util.Scanner;

class Employee{
	private int empId;
	private String empName;
	private double salary;
	
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	public int getid() {
		
		return empId;
	}
	
	
	
	
	
}

public class TostringQ50 {	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee arr[]=new Employee[5];
		int count=0;
		
		outer:
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter Employee Id : ");
			int empId=sc.nextInt();
			System.out.print("Enter Employee Name : ");
			String empName=sc.next();
			System.out.print("Enter Employee Salary : ");
			double salary=sc.nextDouble();
			
			for(int j=0;j<count;j++) {
				int k=arr[j].getid();
		        if(k==empId) {
		        	System.out.println("These Employee id already exist:");
		        	continue outer;
		        }
			}
			
			
			Employee e=new Employee(empId,empName,salary);
			
			arr[i]=e;
			count++;
			i++;
		}
		
		for(Employee a: arr) {
			System.out.println(a.toString());
		}

	}

}
