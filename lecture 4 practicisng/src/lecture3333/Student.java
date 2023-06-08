package lecture3333;

public class Student {
    private String name;
    private int id;
    private double cgpa;
    void setInformation(String n,int i,double c){
        name = n;
        id = i;
        cgpa = c;

    }
    void displayInformation(){
        System.out.println("Student name : "+name );
        System.out.println("id : "+id);
        System.out.println("cGpA : "+cgpa);
    }
}
