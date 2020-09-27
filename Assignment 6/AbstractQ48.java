import java.util.Scanner;
abstract class Processor{
    int data;
    void showData(double data){
        System.out.println("Result : " + data);
    }
    abstract void process(); 
}

class Factorial extends Processor{
    Scanner sc = new Scanner(System.in);

    int fNo = sc.nextInt();
 
    void process(){
        int fact = 1;
        for(int i=1;i<=fNo;i++){
            fact *= i;
        }
        super.showData(fact);
    }
    
} 

class Circle extends Processor{
    Scanner sc = new Scanner(System.in);
    double radius = sc.nextDouble();

    final double pi = 3.14;

    void process(){
        double area = pi * radius * radius;
        super.showData(area);
    }

    
}

class AbstractQ48{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1.Factorial");
        System.out.println("2.Area");
        int n = sc.nextInt();

        switch(n){
            case 1 :
                System.out.println("Enter the Number : ");
                Factorial f = new Factorial();
                f.process();
                break;
            case 2 :
                System.out.println("Enter the Radius : ");
                Circle c = new Circle();
                c.process();
                break;
            default :
                System.out.println("Try again");
        }

    }
}