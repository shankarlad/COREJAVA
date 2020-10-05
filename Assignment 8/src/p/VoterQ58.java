package p;

class Voter{
	int voterId;
	String name;
	int age;
	
	public Voter(int voterId, String name, int age) throws Exception {
		super();
		this.voterId = voterId;
		this.name = name;
		
		if(age < 18) {
			throw new Exception();
		}
		else {
			this.age = age;
		}
		
	}

	@Override
	public String toString() {
		return "voterId=" + voterId + ", name=" + name + ", age=" + age;
	}
	
	
	
}

public class VoterQ58 {

	public static void main(String[] args) {
		Voter v;
		try {
			v = new Voter(101,"Shankar",17);
			System.out.println(v);
		} catch (Exception e) {
			System.out.println("Age less than 18 years");
		}
		
	}

}
