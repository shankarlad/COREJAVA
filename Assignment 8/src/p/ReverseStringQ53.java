package p;

public class ReverseStringQ53 {

	public static void main(String[] args) {

		
		String str="Shankar";

				
		StringBuilder s=new StringBuilder();
			s.append(str);
			s=s.reverse();
			System.out.println(s);
			
		StringBuffer ss=new StringBuffer(str);
		    ss.reverse();
			System.out.println(ss);
	

	}

}
