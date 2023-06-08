package eee;

public class MethodOverloading {
    int a,b,c;
    void sum(int a,int b){
        this.a =a;
        this.b=b;

    }
    void sum(int a,int b,int c){
        this.a= a;
        this.b=b;
        this.c=c;


    }
    void display(){
        System.out.println("the sum of 2 numbers:"+(a+b));
        System.out.println("the sum is : "+(a+b+c));
    }
    public static void main(String[] args) {
        MethodOverloading method1 = new MethodOverloading();
        method1.sum(12,13);
        method1.sum(45,12,56);
        method1.display();
    }
}
