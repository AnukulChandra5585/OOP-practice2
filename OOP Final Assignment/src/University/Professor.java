package University;

public class Professor extends Employee {
    private String subjectOfExpert = " Mathematics";
    public Professor(String eId,String N,String S,String SOE ){
        super(eId,N,S);
        this.subjectOfExpert= SOE;
    }
     public String getSubjectOfExpert(){
         return subjectOfExpert;


     }

     public String toString(){
         return super.toString ()+ " \nSubject Of Expert :"+subjectOfExpert;
     }
}
