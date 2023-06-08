package Lecture_8;
//Method OverRiding
public class Bike extends Vehicle {
    void run(){
        System.out.println("Pulsar bike ");
    }
    public static void main(String[] args) {


        Bike pulsar = new Bike();
        pulsar.run();
    }
}