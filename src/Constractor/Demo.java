package Constractor;

public class Demo {
    public Demo(){
        System.out.printf ("There is no argument Constractor");
    }
    public void info(){
        System.out.printf ("This is a method");
    }

    public static void main(String[] args) {
        Demo d = new Demo ();
    }
}
