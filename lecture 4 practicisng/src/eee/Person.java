package eee;

public class Person {
    String Name;
    int Age;
    void setInformation(String N, int A)
    {
        Name = N;
        Age = A;

    }
    void displayInformation(){
        System.out.println("the person1 is :"+Name);
        System.out.println("his age:"+Age);
    }
}
