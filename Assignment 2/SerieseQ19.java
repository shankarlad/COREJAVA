import java.util.Scanner;

class SerieseQ19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms : ");
		int n = sc.nextInt();
		int sum = 2;
		for ( int i=1;i<=n;i++){
			
			sum = sum + 10;
			System.out.print(sum);
			if (i!=n){
				System.out.print("+");
			}
			
		}
		
	}
}