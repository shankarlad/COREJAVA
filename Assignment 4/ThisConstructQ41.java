class Student{
    private int rollNo;
    private String name;
   
    Student(){
        this(101,"Shankar");
    }

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    void show(){
        System.out.println(" RollNo : "+rollNo+"  Name : "+name);
    }
}

class ThisConstructQ41{
    public static void main(String args[]){
        Student s = new Student();
        s.show();

        Student s1 = new Student(102,"Bhushan");
        s1.show();
    }
}