public class Teacher {
    private  String userId;
    private String Password;
    public Teacher(String UId,String Pass){
        this.userId= UId;
        this.Password= Pass;


    }
    public boolean LogIn(String UId,String Pass){
        if(UId==userId && Pass==Password){
            System.out.println("Log in successfull");
            return true;
        }
        else{
            System.out.println("Invalid UId and Password");
            return false;
        }
    }
}
