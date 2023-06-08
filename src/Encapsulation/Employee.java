package Encapsulation;

public class Employee {
    private String name ;
    private int id ;
    private double saalry;
    public  Employee(){

    }
    public  void setName(String n){
        this.name= n;

    }
    public void setAge(int a){
        this.id=a;

    }
    public  void setSalary(double s){
        this.saalry=s;
    }
    public String getName(){
        return name;


    }
    public int getId(){
        return id;

    }
    public  double getSalary(){
        return saalry;
    }

    public static void main(String[] args) {
        Employee e = new Employee ();
        e.setName ("Anukul Chandra");
       e.setAge (22);
       e.setSalary (233332.9);
        System.out.println (" Name is "+e.getName ()+"\n Age "+e.getId ()+"\n Saalry :"+e.getSalary ());

    }
}
