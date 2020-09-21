class NewStudent {
    public int rno;
    public String name;

    static public int countObj = 0;

    NewStudent() {
        countObj++;

    }

    void setData(final int roln, final String sname) {
        rno = roln;
        name = sname;
    }

    void showData() {
        System.out.println("Rollno: " + rno + " Name: " + name);

    }

    static void getObjCount() {
        System.out.println("Object no: " + countObj);

    }
}

public class StudentDemo1 {

    public static void main(String[] args) {
        NewStudent e1 = new NewStudent();
        e1.setData(101, "Shankar");
        e1.showData();
        
        NewStudent e2 = new NewStudent();
        NewStudent e3 = new NewStudent();
        NewStudent e4 = new NewStudent();
        NewStudent.getObjCount();

    }
}

