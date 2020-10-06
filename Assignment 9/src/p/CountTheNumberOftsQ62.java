package p;

import java.io.*;
import java.util.Scanner;

public class CountTheNumberOftsQ62 {

	public static void main(String[] args) throws FileNotFoundException {
		
		 String fileName = "D:\\dir\\my.txt";
	        String line = "";
	        Scanner scanner = new Scanner(new FileReader(fileName));
	        try {

	          while ( scanner.hasNextLine() ){
	            line = scanner.nextLine();
	            int counter = 0;

	            for( int i=0; i<line.length(); i++ ) {
	                if( line.charAt(i) == 't' ) {
	                    counter++; 

	                } 
	            }

	             System.out.println(counter);   
	          }
	        }
	        finally {

	          scanner.close();


	    }
		

            

	}

}
