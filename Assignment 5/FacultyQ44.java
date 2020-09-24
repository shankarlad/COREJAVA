
class Faculty{
    private int facultyId;
    private float salary;

    void input(int facultyId){
        this.facultyId = facultyId;
    }

    void printSalary(float salary){
        System.out.println("Faculty ID : " + facultyId + "  Salary : " + salary);
    }
}


class FullTimeFaculty extends Faculty{
    private float basicSalary;
    private float allowance;

    void input(int facultyId,float basicSalary,float allowance){
        super.input(facultyId);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    void printSalary(){
        float salary;
        salary = basicSalary + allowance;
        System.out.print("Salary of Full time faculty : ");
        super.printSalary(salary);
    }
}

class PartTimeFaculty extends Faculty{
    private int workingHours;
    private float ratePerHour;

    void input(int facultyId, int workingHours,float ratePerHour){
        super.input(facultyId);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

     void printSalary(){
        float salary;
        salary = workingHours * ratePerHour;
        System.out.print("Salary of Part time faculty : ");
        super.printSalary(salary);
    }
}

class FacultyQ44{
    public static void main(String args[]){

        FullTimeFaculty ft = new FullTimeFaculty();
        ft.input(101,5000f,250f);
        ft.printSalary();

        PartTimeFaculty pt = new PartTimeFaculty();
        pt.input(102,6,100f);
        pt.printSalary();
    }
}