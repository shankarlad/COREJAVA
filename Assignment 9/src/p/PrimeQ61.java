package p;

import java.util.Scanner;

class PrimeNoCheckThread implements Runnable{
	public void run() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		
	    for(int i=2;i<num;i++) {
	    	if(num % i==0) {
	    		flag=1;
	    		break;
	    	}
	    }
	    if(flag==0) {
	    	System.out.println(num+" is a prime number");
	    }
	   else
	  	System.out.println(num+" is  a not prime number");
	   }
}

public class PrimeQ61 {

	public static void main(String[] args) {
		PrimeNoCheckThread m=new PrimeNoCheckThread();
	    Thread p=new Thread(m);
		p.start();
	

	}

}