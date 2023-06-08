package Sir;

public class Customer {
    private  String Name;
    private  int Age;
    Customer(){

    }
    Customer(String Name,int Age){
        this.Name = Name;
        this.Age = Age;

    }
    public void Display(){
        System.out.println("Customer details :");
        System.out.println("customer name :"+ Name);
        System.out.println("his Age :"+Age);
    }
}
