package Lecture_7;

public class Get_Set_method {
    private String Name;
    private String Id;
    private int Age;

    public void setInformation(String N, String I, int a) {
        this.Name = N;
        this.Id = I;
        this.Age = a;

    }

    public String getValue() {
        return Name;



    }
    public String getId(){
        return Id;
    }
    public int getAge(){
        return Age;
    }


    public static void main(String[] args) {
        Get_Set_method Student1= new Get_Set_method();
        Student1.setInformation("Anukul Chandra","221-15-5585",22);
        System.out.println("Name :"+Student1.getValue());
        System.out.println("Id :"+Student1.getId());
        System.out.println("Age :"+Student1.getAge());
    }
}