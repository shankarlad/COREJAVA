package p;
import java.util.Scanner;

class InvalidFeeException extends Exception{
	InvalidFeeException(String msg){
	System.out.println(msg);
	}
}


interface StudentFee{
	void getFee(float fees) throws InvalidFeeException;
}

class Student implements StudentFee{
	
	String name;
	float fees;
	
	
	public Student(String name) {
		super();
		this.name = name;
	}


	public void getFee(float fees) throws InvalidFeeException {
		if(fees <= 0 || fees > 100000 ) {
			throw new InvalidFeeException("ERROR : Fee Amount is not valid");
		}else {
			this.fees = fees;
		}
		
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", fees=" + fees + "]";
	}
	
	


}

public class StudentQ59 {

	public static void main(String[] args) throws InvalidFeeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fees : ");
		float fees = sc.nextFloat();
		
		Student s = new Student("Shankar");
		s.getFee(fees);		
		System.out.println(s);
	}

}
