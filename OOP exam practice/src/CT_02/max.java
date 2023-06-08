package CT_02;
import java.util.Scanner;
public class max {



        public static void main(String[] args) {
            int num;
            System.out.println("Enter the number ");
            Scanner an = new Scanner(System.in);
            num = an.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is Even");

            } else {
                System.out.println(num + " is Odd");

            }
        }
    }





