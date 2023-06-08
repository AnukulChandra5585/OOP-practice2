package University;

public class SupportStaff extends Employee {
    private String jobTitle = " Security Guird";
    public SupportStaff(String eId,String N,String S,String Jt){
        super(eId,N,S);
        this.jobTitle= Jt;
    }

    public String getJobTitle(){
        return jobTitle;


    }
    public String toString(){
        return super.toString()+ "\nJob Title :"+jobTitle;
    }
}
