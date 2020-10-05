package p;



public class EverywordReverseQ56 {

	public static void main(String[] args) {
		
		String str = "Shankar Lad";
		String reverseWord="";
		String str1[]=str.split(" ");
		
		for(String s:str1) {
			StringBuilder ss=new StringBuilder(s);
			ss.reverse();
			reverseWord+=ss+" ";
		}
		System.out.print(reverseWord);

	}

}
