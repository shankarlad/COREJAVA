import java.util.Scanner;

class Circle{
    private float radius;
    private float areaOfCircle;
    Scanner sc = new Scanner(System.in);

    void init(){
        System.out.print("Enter the Area of Circle : ");
        radius = sc.nextFloat();
    }

    void calculateArea(){
        float pie = 3.14f;

        areaOfCircle = pie * radius * radius;
    }

    void display(){
        System.out.println("Radius of Circle is : " + radius );
        System.out.println("Area of Circle is : " + areaOfCircle );
    }
}

class CircleDemoQ34{
    public static void main(String args[]){
        Circle c = new Circle();
        c.init();
        c.calculateArea();
        c.display();


    }
}