package LabClass;

public class User {
    private String userId;
    private String Password;
    public User(String Id,String Pass){
        this.userId=Id;
        this.Password=Pass;

    }

    public boolean LogIn(String Id,String Pass) {

        if(Id==userId && Pass==Password){
            System.out.println("Log in sucessfully");
            return true;
        }
        else{
            System.out.println("Wrong Id and password");
            return false;
        }

    }
}
