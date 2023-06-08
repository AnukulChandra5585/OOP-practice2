package Constractor;
// Example 1

import java.io.PrintStream;

public class MyClass {

    int x;

    public MyClass() {
       x =5;
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass ();
        System.out.printf (" X ="+myObj.x);
    }
}
