import java.io.*; 
import java.util.Scanner;
  
class RowSumQ26 { 
    
  
  
// Get the size m and n 
static int m = 4; 
static int n = 4; 
  
// Function to calculate sum of each row 
static void row_sum(int arr[][]) 
{ 
  
    int i,j,sum = 0; 
  
    System.out.print( "\nFinding Sum of each row:\n\n"); 
  
    // finding the row sum 
    for (i = 0; i < 4; ++i) { 
        for (j = 0; j < 4; ++j) { 
  
            // Add the element 
            sum = sum + arr[i][j]; 
        } 
  
        // Print the row sum 
        System.out.println( "Sum of the row "
            + i + " = " + sum); 
          
  
        // Reset the sum 
        sum = 0; 
    } 
} 
  
  
// Driver code 
    public static void main (String[] args) { 
	Scanner sc = new Scanner(System.in);
            int i,j; 
    int [][]arr = new int[m][n]; 
  
    // Get the matrix elements 
  
    for (i = 0; i < m; i++) 
        for (j = 0; j < n; j++) 
            arr[i][j] = sc.nextInt();
  
    // Get each row sum 
    row_sum(arr); 

    } 
} 