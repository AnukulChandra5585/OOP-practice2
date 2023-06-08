package Lecture_7;

public class Account {
    private double Balance ;
    public void updateBalance(double B){
        this.Balance= B;

    }
    public double checkBalance(){
        return Balance;
    }

    public static void main(String[] args) {
        System.out.println("Atm Machine");
    }
}
