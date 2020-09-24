import java.util.Scanner;
class Product{

    private int pid;
    public int price;
    private int quantity;

    Product(int pid, int price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    void showData(){
		
		System.out.println("PID : " + pid);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
	}

}

class ProductQ39{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Product a[] = new Product[5];

        int max = 0;

        for(int i = 0 ; i < a.length; i++){
            System.out.print("Enter the PID of item "+(i+1)+" : ");
            int pid = sc.nextInt();
            System.out.print("Enter the Price of item "+(i+1)+" : ");
            int price = sc.nextInt();
            System.out.print("Enter the Quantity of item "+(i+1)+" : ");
            int quantity = sc.nextInt();

            Product p = new Product(pid,price,quantity);
            a[i] = p;

            if(i == 0){
                continue;
            }
            if(a[i].price > a[i - 1].price){
                max = a[i].price;
            }
        }

        System.out.println("Max price is : " + max);
    }

}