package University;

public class Employee {
    private  String employeeId ;
    private String Name ;
    private String salary ;
    public Employee( String eId,String N,String S){
        this.employeeId = eId;
        this.Name= N;
        this.salary= S;
    }
    public String  getEmployeeId() {

        return employeeId;
    }
        public String getName(){
            return Name;
        }
        public String getSalary(){
        return salary;
    }
     public String toString(){
        return "Employee ID :"+employeeId+"\nName :"+Name+"\nSalary :"+salary;
     }

}
