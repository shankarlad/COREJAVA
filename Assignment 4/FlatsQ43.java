import java.util.Scanner;
class OneBHK{
    private double roomArea;
    private double hallArea;
    private double price;

    OneBHK(){
        roomArea = 100;
        hallArea = 200;
        price = 40000;
    }

    OneBHK(double roomArea,double hallArea, double price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    void show(){
        System.out.println("Room Area : " + roomArea);
        System.out.println("Hall Area : " + hallArea);
        System.out.println("Price : " + price);
    }
}

class TwoBHK extends OneBHK{
    private double room2Area;

    TwoBHK(){
        super();
        room2Area = 150;
    }

    TwoBHK(double roomArea,double hallArea, double price,double room2Area){
        super(roomArea,hallArea,price);
        this.room2Area = room2Area;
    }

    void show(){
        super.show();
        System.out.println("Room 2 Area : " + room2Area);
    }
}

class FlatsQ43{

    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    double total = 0;

    TwoBHK arr[] = new TwoBHK[3];

    for (int i = 0; i<3; i++){
         System.out.println("Enter Room1 area : ");
	        double roomArea = sc.nextDouble();
	        System.out.println("Enter Room2 area : ");
	        double room2Area = sc.nextDouble();
	        System.out.println("Enter Hall area : ");
            double hallArea = sc.nextDouble();
            System.out.println("Enter Price : ");
            double price= sc.nextDouble();

             total += price;

             TwoBHK t = new TwoBHK(roomArea,hallArea,price,room2Area);
             arr[i] = t;
    } 

   for(int i=0; i<arr.length; i++)
	    arr[i].show();

    System.out.println("Total Amount of Flats : "+total);

    }

}