import java.util.Scanner;

class MathOperation{

    static int sum(int a, int b){
        return a + b;
    }

    static int subtract(int a, int b){
        return a - b;
    }
    
    static int multiply(int a, int b){
        return a * b;
    }

    static int power(int a, int b){
       int result = 1;
        for (int i=1;i<=b;i++){
             result*=a;
        }
        return result;
    }
    
}

class MathOperationQ35{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();

        System.out.println("Additon : " + MathOperation.sum(a,b));
        System.out.println("Substraction : " + MathOperation.subtract(a,b));
        System.out.println("Multiplication : " + MathOperation.multiply(a,b));
        System.out.println("Power : " + MathOperation.power(a,b));
    }
}