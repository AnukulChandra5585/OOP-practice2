package Lecture_7;
//Uml Respresentation(Example 2 )

public class Person {
    private String Name ;
    private int age ;
    public Person(String N, int A){
        this.Name= N;
        this.age=A;

    }
    public void setName(String N){
        this.Name= N;
    }
     public void setId(int A){
        this.age=A;
     }
     public String getName(){
        return Name;
     }
     public int getId(){
        return age;
     }
}
