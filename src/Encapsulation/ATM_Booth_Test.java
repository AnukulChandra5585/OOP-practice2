package Encapsulation;

public class ATM_Booth_Test {
    public static void main(String[] args) {
        ATM_Booth booth1= new ATM_Booth();
        booth1.setBalance(1234.67);
        System.out.println(booth1.getBalance());
    }
}
