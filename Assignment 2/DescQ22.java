import java.util.Scanner;

class DescQ22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 elements : ");
		int arr [] = new int [10];
		for ( int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Desceding order of array : ");
		
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                  int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        } 
		
		for (int a : arr){
			System.out.print(" "+a+" ");
		}
		
		
		
	}
}