
class MathOperation{


    static int multiply(int a, int b){
        return a * b;
    }

    static float multiply(float x, float y){
        float m = (float)(x*y);
        return m;
    }

    static int multiply(int a[]){
        int m = 1;
        for(int i=0;i<a.length;i++){
            m = m * a[i];
        }
        return m;
    }

    static double multiply(int a, double b){
        double m = (double)a * b;
        return m;
    }
    
}

class MathOperationQ36{
    public static void main(String args[]){
        System.out.println("Multiplication : " + MathOperation.multiply(5,2));
        System.out.println("Multiplication : " + MathOperation.multiply(5.2f,2.3f));
        int a[] = {2,3,4};
        System.out.println("Multiplication : " + MathOperation.multiply(a));
        System.out.println("Multiplication : " + MathOperation.multiply(5,5.5));

    }
}