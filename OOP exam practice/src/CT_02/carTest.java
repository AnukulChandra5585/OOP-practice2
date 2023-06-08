package CT_02;

import java.util.concurrent.Callable;

public class carTest {
    public static void main(String[] args) {
        Engine eng=new Engine();
        Dashbord dash= new Dashbord();
       Car car = new Car();
       car.drive();
       car.stop();
        Volvo volvo1= new Volvo(123300.9,"2014","20-22-2023",eng,dash);
        System.out.println("Engine size"+eng.size);
        System.out.println("Dashbord capacity :"+dash.capcity);
    }

}
