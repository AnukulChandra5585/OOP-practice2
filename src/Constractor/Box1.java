package Constractor;

public class Box1 {
    int height ;
    int weight;
    public Box1(){
        height= 10;
        weight= 20;
        System.out.println ("The Box is created");
    }

    public static void main(String[] args) {
        Box1 box1= new Box1 ();
        System.out.println ("The Height of the Box 1 "+box1.height);
        System.out.println("The weight of the Boxq "+box1.weight);
        Box1 box2 = new Box1 ();
        System.out.printf (" The height of thye box 2"+box2.weight);
    }
}
