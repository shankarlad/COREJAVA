class GandsQ27{  
public static int getSmallest(int[] a, int size){  
int temp;  
for (int i = 0; i < size; i++)   
        {  
            for (int j = i + 1; j < size; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[0];  
}  

public static int getLargest(int[] a, int size){  
int temp;  
for (int i = 0; i < size; i++)   
        {  
            for (int j = i + 1; j < size; j++)   
            {  
                if (a[i] < a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[0];  
} 

public static void main(String args[]){  
int a[]={1,2,5,6,3,2};   
System.out.println("Smallest: "+getSmallest(a,6));  
System.out.println("Greatest: "+getLargest(a,6));  
}}  