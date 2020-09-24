class Employee{
    private int empId;
    private String empName;

    void setData(int empId,String empName){
        this.empId = empId;
        this.empName = empName;
    }

    void showData(){
        System.out.println(empId + "  " + empName);
    }
}

class ThisKeywardQ33{
    public static void main(String args[]){
        Employee e = new Employee();
        e.setData(101,"Shankar");
        e.showData();
    }
}