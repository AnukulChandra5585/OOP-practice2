package CT_02;

public class AddressInfo {
    public String street;
    public String city;
    public String state;
    public String postalCode;
    public AddressInfo(String S,String C,String St,String pc){
        this.street=S;
        this.city= C;
        this.state=St;
        this.postalCode= pc;
        System.out.println("Street :"+street);
        System.out.println("City :"+city);
        System.out.println("State :"+state);
        System.out.println("postal code : "+postalCode);
    }



}
