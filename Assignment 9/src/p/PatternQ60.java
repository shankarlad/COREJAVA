package p;

import java.util.Scanner;

class Starthread extends Thread{
	int num;
	public Starthread(int num) {
		super();
		this.num = num;
	}
	
	public void run() {
		for(int i=0;i<num;i++) {
			for(int j=0;j<12;j++) {
				System.out.print("*");
			}
			System.out.println();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		}
	}

public class PatternQ60 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows : ");
		int x=sc.nextInt();
		Starthread s=new Starthread(x);
		s.start();

	}

}