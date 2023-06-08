public class User {
    private String userId;
    private String Password;
    private String gender ;


    User() {
    }
        User(String Id,String Pass)
    {
        this.userId = Id;
        this.Password = Pass;
    }
    User(String Id){
        this.userId=Id;

    }
    User(String Id,String Pass,String sex){
        this.userId=Id;
        this.Password=Pass;
        this.gender=sex;


    }


      public   void Display() {
            System.out.println("user Id : "+userId);
            System.out.println("password: "+Password);
          System.out.println("Gender :"+gender);
        }

    }

