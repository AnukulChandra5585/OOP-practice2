package Hadi;

public class Student extends Person {
    private int id;
    private double cgpa;
    Student(String N,int A,int I,double C){
        super(N,A);
        this.id=I;
        this.cgpa=C;
    }
    public void display(){
       super.display();
        System.out.println("Name : "+id);
        System.out.println("Age : "+cgpa);
    }

    public static void main(String[] args) {
        Student student= new Student("Hadia",22,5589,3.58);
        student.display();
        Person person1= new Person("awal hadi",22);
        person1.display();
    }
}
