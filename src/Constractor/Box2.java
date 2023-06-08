package Constractor;

public class Box2 {
    int height ;
    int weight;
    public Box2(int a, int b){

        System.out.println (" Box is created");
        this.height=a;
        this.weight=b;

    }

    public static void main(String[] args) {
        Box2 box2= new Box2 (20,48);
        System.out.println (" the height of the box is :"+box2.height);
        System.out.println (" tehe weight is "+ box2.weight);
        Box2 box3 = new Box2 (30,78);
        System.out.println (" the gdeid"+box3.height);
        System.out.println (box3.height);
    }
}
