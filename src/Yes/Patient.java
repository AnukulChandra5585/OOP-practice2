package Yes;

import Encapsulation.Person;

public class Patient {
    private String name;
    private int birthYear;
    private int age;
    private String address;
    private String phoneNumber;
    private String gender;
    private String bloodGroup;
    private boolean appointmentStatus;
    private boolean paymentStatus;

    public void  provideInfo(String name, int birthYear, String address, String phoneNumber, String gender, String bloodGroup) {
        this.name = name;
        this.birthYear = birthYear;
        this.age = 2023 - birthYear;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.appointmentStatus = true;
        this.paymentStatus =true;
        System.out.println("Name: " + this.name);
        System.out.println("Birth Year: " + this.birthYear);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Gender: " + this.gender);
        System.out.println("Blood Group: " + this.bloodGroup);
    }




    public void makeAppointment() {
        this.appointmentStatus = false;
        System.out.println("Appointment made successfully.");
    }

    public void payFees() {
        this.paymentStatus = false;
        System.out.println("Payment completed successfully.");
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient();
        patient1.provideInfo("Alex",2002,"Dhaka","0195464584","Male","A+");
        patient1.makeAppointment();
        patient1.payFees();
    }
}


