package p;



public class UpCaseQ55 {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer();
		char ch=' ';
		String str="shankar lad !! hello how are you ?";
		for(int i=0;i<str.length();i++) {
			if(ch==' ' && str.charAt(i)!=' ') 
				s.append(Character.toUpperCase(str.charAt(i)));
		   else
		        s.append(str.charAt(i)); 
				ch=str.charAt(i);
			
		}
		
		System.out.print(s);

	}

}
