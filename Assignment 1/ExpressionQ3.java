class ExpressionQ3{
	public static void main(String args[]){
		
		int x = 5;
		int y,z;
		y = (x*x) + 3*x -7;
		System.out.println(y);
		
		y = x++ + ++x;
		System.out.println(y);

		z = x++ - --y - --x  +  x++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		/*
		boolean x=5;
		boolean y=5;
		boolean z;
		z = x && y || !(x || y);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		*/
	}
}