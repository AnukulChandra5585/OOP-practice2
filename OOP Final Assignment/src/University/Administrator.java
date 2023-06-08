package University;

public class Administrator extends Employee{
    public String department = "CSE";
    public Administrator(String eId,String N,String S,String d){
        super(eId,N,S);
        this.department= d;

    }
    public String getDepartment(){
        return department;
    }
    public String toString(){
        return super.toString()+ "\nDepartment :"+department;

    }
}
