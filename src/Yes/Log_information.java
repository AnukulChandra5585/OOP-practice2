package Yes;

public class Log_information {
    private String id;
    protected  boolean password;
    public void SetValues(String Id){
        this.id= Id;
        this.password=false;
    }
    public void checkPassword(){
        this.password=true;
        System.out.println("log in successfully");
    }

    public static void main(String[] args) {
        Log_information attempt1 = new Log_information();
        attempt1.SetValues("221-15-5585");
        attempt1.checkPassword();

    }
}
