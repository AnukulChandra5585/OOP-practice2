package Lecture_8;

public class MyCalculation extends Calculation{
    public void multiplication(int x,int y){
        z = x*y;
        System.out.println("Multiplication :"+z);
    }
    public void divison(int x,int y){
        z = x/y;
        System.out.println("division :"+z);
    }

    public static void main(String[] args) {
        MyCalculation demo1 = new MyCalculation();
        demo1.addition(29,33);
        demo1.divison(12,45);
        demo1.subtraction(23,67);
    }
}
