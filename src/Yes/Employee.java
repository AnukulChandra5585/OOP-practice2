package Yes;

public class Employee {
    private double payRate ;
    public Employee(int r){
        this.payRate=r;
    }
    public Employee(double z){
        this.payRate=z;
    }

    public static void main(String[] args) {
     Employee employee1= new Employee(23);
     Employee employee2= new Employee(23.5);
        System.out.println(+employee2.payRate);
    }
}
