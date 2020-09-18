import java.util.Scanner;

class SumAvgQ21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 elements : ");
		int arr [] = new int [10];
		for ( int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int a : arr){
			sum += a;
		}
		float avg = (float)sum/10;
		System.out.println("Sum of 10 elements in array : " +sum);
		System.out.println("Average of 10 elements in array : " +avg);
		
	}
}