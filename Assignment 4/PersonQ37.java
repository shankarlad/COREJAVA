class Person{
    private int age;
    private String name;

    Person(String name){
        age = 18;
        this.name = name;
    }

   Person(int age,String name){
        this.age = age;
        this.name = name;
    }

    void show(){
        System.out.println("Name : "+ name + "  Age : "+ age);
    }



}

class PersonQ37{
    public static void main(String argd[]){
        Person p = new Person("Shankar");
        p.show();

        Person p1 = new Person(25,"Prathamesh");
        p1.show();
    }
}