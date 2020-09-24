class Person{
	Person(){                      // 3
		this(45);
		System.out.println("no-arg Person");
	}
     	Person(int i){                 // 4
		System.out.println("param Person");
	}
}
class Employee extends Person{
	Employee(){                  //     1
		this(12);
		System.out.println("no-arg Employee");
	}
	Employee(int i){              //    2
		//here first line of constructor is parent default constructor call i.e super();
		System.out.println("parameter Employee");
	}	
}
class ConstructorChainQ47{
	public static void main(String args[]){
		Employee e1 = new Employee();	
	}
}