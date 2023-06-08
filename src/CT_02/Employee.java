package CT_02;

public class Employee {
    public String Name;
    public Employee(String N){
        this.Name=N;
        System.out.println("Empoyee name :"+Name);
    }

    public static void main(String[] args) {
        Employee employee= new Employee("Anukul chandra");
        AddressInfo address= new AddressInfo("mirpur rode","dhaka","bangladesh","3443");

    }
}
