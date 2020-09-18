import java.util.Scanner;

class ReverseQ23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 elements : ");
		int arr [] = new int [5];
		for ( int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Reverse order of array : ");
		
		for (int i = arr.length-1; i >=0 ; i--) {     
              		System.out.print(" "+arr[i]+" ");
        	} 
		
	}
}