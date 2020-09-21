import java.util.Scanner;

class Student{
	private int rollNo;
	private String name;
	
	/*Part of question 32 Declaring static count variable to count number of objects*/
	public static int count;
	
	void setData(int rollNo,String name,int count){
		this.rollNo = rollNo;
		this.name = name;
		this.count = count;
	}
	
	void showData(){
		
		System.out.println("   " + rollNo + "        " + name + "    " + count);
	}
	
}

class StudentDemo{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please Enter the RollNo : ");
	int rollNo = sc.nextInt();
	
	System.out.print("Please Enter the Name : ");
	String name = sc.next();
	int count = 1;
	Student s = new Student();
	s.setData(rollNo,name,count++);
	System.out.println("===============================");
		System.out.println("        Student Data       ");
		System.out.println("===============================");
		System.out.println("  RollNo      Name     Objcount");
		System.out.println("===============================");
	s.showData();
	
	
	Student s1 = new Student();
	s1.setData(102,"Prathamesh",count++);
	s1.showData();	
	
	Student s2 = new Student();
	s2.setData(103,"Bhushan",count++);
	s2.showData();	
	
	/* Accessing the Static member of class using class without object*/ 
	int i = Student.count;
	System.out.println("===============================");
	System.out.println("Total Number of object count: " + i);
	System.out.println("===============================");
	}
	
}