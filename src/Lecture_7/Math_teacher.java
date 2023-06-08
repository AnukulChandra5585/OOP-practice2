package Lecture_7;

public class Math_teacher extends Teacher {
    private String Name;
    private int age;


    public Math_teacher(String UId,String Pass,String Name,int age){
        super(UId,Pass);
        this.Name= Name;
        this.age=age;


    }
}
