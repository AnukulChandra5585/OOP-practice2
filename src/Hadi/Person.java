package Hadi;

public class Person {
    public String name;
    public int age;
Person(String N,int A){
    this.name=N;
    this.age=A;
}
public void display(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
}
}
