package Lecture_8;

public class B extends A{
    int x= 13;
    public B(){
        System.out.println("B is the constractor ");
    }
    public void display(){
        super.display();
        System.out.println("ok done ");
    }

    public static void main(String[] args) {
        B b= new B();
        b.display();
    }
}
