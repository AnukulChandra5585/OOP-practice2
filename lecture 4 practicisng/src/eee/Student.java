package eee;

public class Student {
    private String id;
    private String Name;
    private Double cgpa;
    void insert_Record(String id,String Name,Double cgpa){
        this.id= id;
        this.Name=Name;
        this.cgpa = cgpa;


    }
     public void display_Record(){
        System.out.println(" the student name :"+id);
        System.out.println(" the student id :"+Name);
        System.out.println("cgpa is : "+cgpa);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.insert_Record("221-15-5585","anukul chnadra",3.50);
        student1.display_Record();

    }
}
