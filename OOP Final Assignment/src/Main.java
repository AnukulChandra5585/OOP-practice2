import University.Administrator;
import University.Employee;
import University.Professor;
import University.SupportStaff;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee ("221-15-5585","Akash","670000 tk");
        Professor p = new Professor ("221-15-5587","Akashrr","78000 tk","Mathematics");
        Administrator a = new Administrator ("444-645-76","Lutfur Rahman ","100000 tk","Cse");
        SupportStaff s = new SupportStaff ("5535635-646","Borkot ali","30000 tk","Security Guird");
        System.out.println(e.toString ());
        System.out.println (p.toString());
        System.out.println(a.toString());
        System.out.println (s.toString());



    }
}