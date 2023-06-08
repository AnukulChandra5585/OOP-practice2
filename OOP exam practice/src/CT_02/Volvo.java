package CT_02;

public class Volvo extends Car{
    public double price ;
    public String productionYear;
    public String registration;
    public Engine eng;
    public Dashbord dash;

    public Volvo(double P,String pY,String R,Engine eng,Dashbord dash){
        this.price= P;
        this.productionYear=pY;
        this.registration=R;
         this.eng=eng;
         this.dash= dash;
        System.out.println("price : "+price);
        System.out.println("Production Year :"+productionYear);
        System.out.println("registration :"+registration);
    }
    public void changeFuel(){
        System.out.println("plz Change fuel");
    }
 public void checkBettery(){
     System.out.println("plz check your bettery ");
 }

}
