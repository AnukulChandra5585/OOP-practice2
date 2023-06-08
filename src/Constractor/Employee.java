package Constractor;

public class Employee {
    int eId;
    String empName;
    public Employee(int id,String N){
        System.out.println (" The employee info :");
     this.eId= id;
     this.empName =N;
    }
    public void info(){
        System.out.println (" Id :"+eId+" Name :"+empName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee (221-15-5585," Akash");
        Employee e2 = new Employee (4444," CHandra");
        System.out.println (e1.eId);
        System.out.println (e1.empName);
        e1.info ();
        e2.info ();
    }
}
