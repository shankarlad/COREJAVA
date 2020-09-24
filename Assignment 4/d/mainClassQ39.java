import java.util.*;
class productQ39 {

	public int pid;
	public int price;
	public int quantity;
	
	productQ39(int pid,int price,int quantity)
	{
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	void display()
	{
		System.out.println("PID is "+pid);
		System.out.println("Price is "+price);
		System.out.println("Quantity "+quantity);
	}
}

class mainClassQ39 {
	public static void main(String a[])
	{
		Scanner c = new Scanner(System.in);
		productQ39[] arr = new productQ39[2];
		int max = 0;
		for(int i = 0 ; i < arr.length;i++)
		{
			System.out.println("Enter id");
			int pid = c.nextInt();
			System.out.println("Enter Price");
			int price = c.nextInt();
			System.out.println("Enter Quantity");
			int qu = c.nextInt();
			productQ39 p = new productQ39(pid,price,qu);
			arr[i] = p;
			
			
			if(i == 0)
			{
				continue;
			}
			else if(arr[i].price > arr[i - 1].price)
				{
					max = arr[i].price;
				}
		}
		System.out.println("Max price is "+max);
		
	
		
	}
}