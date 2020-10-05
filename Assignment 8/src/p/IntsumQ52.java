package p;

public class IntsumQ52 {

	public static void main(String[] args) {
		String arr[]= {"67","89","23","67","12","55","66"};
		double sum=0;
		for(String i:arr) {
			int a=Integer.parseInt(i);
			sum+=a;
		}
		System.out.println("Sum of Integers are:"+sum);

	}

}
