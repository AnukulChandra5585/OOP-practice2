package Lecture_8;

public class DOCTOR {
    private String name;
    private int id;
    private String hospitalName ;
    private String phoneNumber;
    public DOCTOR(){
        System.out.println("holojoloh");
    }
    public void setData(String N,int I,String HN,String pN){
        this.name=N;
        this.id= I;
        this.hospitalName= HN;
        this.phoneNumber=pN;

    }
    public String getName(){
        return name;
    }
    public int  getId(){
        return id;
    }


    public void display(){
}

    public static void main(String[] args) {

    }
}
