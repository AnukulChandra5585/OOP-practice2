package Lecture_8;
//Example -6
public class Boy extends Human{
    public void eat(){
        System.out.println("Hey boys eat slowly");
    }

    public static void main(String[] args) {
        Boy boy1 = new Boy();
        boy1.eat();;
    }
}
