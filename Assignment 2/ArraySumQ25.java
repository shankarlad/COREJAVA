import java.util.Scanner;

class ArraySumQ25{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr [] = new int []{5,10,15,20,25};
		int i;
		int even = 0;
		int odd = 0;		

		for (i=0;i<arr.length;i++){
			if(i%2==0){
				even += arr[i];	
			}
			else{
				odd += arr[i];
			} 
		}
		System.out.println("Sum of Even index numbers : " + even);
		System.out.println("Sum of odd index numbers : " + odd);
		
	}
}