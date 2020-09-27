interface Taxable{
	double salesTax = 0.07;
	double incomeTax = 1.05;
	void calcTax();
}

class Employee implements Taxable{
	int empId ; 
	String name ;
	double salary;

	Employee(int empId , String name , double salary){
		this.empId = empId ; 
		this.name = name ;
		this.salary = salary;
	}
	
	public void calcTax() {
		
		double tt = salary * incomeTax;
        double it = tt - salary;

		System.out.println("Id : "+empId);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Income Tax  : " +it);
	}
}

class Product implements Taxable{
	int pid;
	double price ; 
	double quantity;

    Product(int pid, double price, double quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
    
  
	public void calcTax() {
		
		double st = price * salesTax;
		
		System.out.println("Product Id : "+pid);
		System.out.println("Price : "+price);
		System.out.println("Quantity : "+quantity);
		System.out.println("Sales Tax  : " +st);
		
	}
	
}


class TaxableQ49{
    public static void main(String args[]){
        Employee e = new Employee(101,"Shankar",25000);
        e.calcTax();
        System.out.println("==================");
        Product p = new Product(111,500,2);
        p.calcTax();
    }
}
