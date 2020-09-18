import java.util.Scanner;

class SearchQ24{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr [] = new int []{5,10,15,20,25};
		
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int i;
		for (i=0;i<arr.length;i++){
			if(arr[i] == n){
				System.out.println(n+" Number is Present in Array");
				break;	
			}
			if(arr[i] != n){
			System.out.println(n + " isn't present in array.");
			break;
			} 
		}
		
		
		 

	
	}
}