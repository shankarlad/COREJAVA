import java.util.Scanner;
class Student{
    private int rollNo;
    private float percentage;

    Student(){
        rollNo = 0;
        percentage = 0;
    }

    Student(int rollNo,float percentage){
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    public int getRollNo() {
		return rollNo;
	}

    public double getPercentage() {
		return percentage;
	}

    void show(){
        System.out.println("RollNo : " + rollNo + " Percentage " + percentage);
    }
}

class CollegeStudent extends Student{
    private int semester;

    CollegeStudent(){
        super();
        semester = 0;
    }

    CollegeStudent(int rollNo,float percentage,int semester){
        super(rollNo,percentage);
        this.semester = semester;
    }

    void show(){
        super.show();
        System.out.println("Semester " + semester);
    }
}

class SchoolStudent extends Student{
    private String className;

    SchoolStudent(){
        super();
        className = null;
    }

    SchoolStudent(int rollNo,float percentage,String className){
        super(rollNo,percentage);
        this.className = className;
    }

    void show(){
        super.show();
        System.out.println("Class Name : " + className);
    }
}

class StudentQ45{
    public static void main(String args[]){
       
       Student s[] = {
                        new CollegeStudent(101,65.5f,2),
                        new CollegeStudent(104,75.80f,5),
                        new SchoolStudent(108,95.27f,"10th"),
                        new SchoolStudent(112,80.66f,"12th"),
                        new SchoolStudent(120,40.45f,"11th")
                    };

        for(Student i : s){
            i.show();
        }

        Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no : ");
		int rn = sc.nextInt();

        for(Student i : s) {
			if(i.getRollNo() == rn) {
				System.out.println(rn +" is Present");
			}
        }	

        for(Student i : s){
			if(i.getPercentage() >= 75) {
				System.out.println(i.getRollNo()+" has A grade ");
			}
		}

    }
}