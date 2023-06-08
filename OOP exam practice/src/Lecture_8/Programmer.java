package Lecture_8;

public class Programmer extends Employee {
    float bonus =1234 ;

    public static void main(String[] args) {
        Programmer vai = new Programmer();
        System.out.println("Programmer salary  : "+vai.Salary);
        System.out.println("Bonus of a programmer  : "+vai.bonus);
    }
}
