package Hadi;

public class Employee {
    private String name ;
    private int id;
    private double salary;
    public Employee(String N,int I,double S){
        this.name= N;
        this.id= I;
        this.salary= S;
    }
    public void setName(String N){
        this.name= N;

    }
    public void  setId(int I){
        this.id=I;
    }
    public void setSalary(double S){
        this.salary= S;

    }
    public String getName(){
        return name ;

    }
    public double getSalary(){
        return salary;

    }

    public static void main(String[] args) {

    }
}
