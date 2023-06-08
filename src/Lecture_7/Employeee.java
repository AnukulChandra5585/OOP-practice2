package Lecture_7;


public class Employeee {
    float salary=4000;

    public class Programmer extends Employeee {
    float salary=4000;
}

    public static void main(String[] args) {
        LabClass.Programmer P = new LabClass.Programmer();
        System.out.println("Programmer salary is :"+P.salary);
        System.out.println("Bonus of Programmer :"+P.bonus);
    }

}

