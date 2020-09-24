class Employee{
    static int empNo = 0;
	private int salary;
	static int totalSalary;

    Employee(int salary){

        empNo+=1;
        this.salary = salary;
        totalSalary+=salary;
    }

    void show(){
       System.out.println("Total Employees are "+ empNo);
	   System.out.println("The total sal is "+totalSalary);
	   System.out.println("----------------");
    }
}

class EmployeeQ38{
    public static void main(String args[]){
        Employee e = new Employee(2500);
        e.show();
        Employee e1 = new Employee(3000);
        e1.show();
        Employee e2 = new Employee(4500);
        e2.show();
    }
}