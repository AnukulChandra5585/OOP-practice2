package Encapsulation;

public class MethodOverloading {

    void Sum(int a,int b){

        System.out.println("Sum :"+(a+b));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.Sum(123,45);
    }
}
