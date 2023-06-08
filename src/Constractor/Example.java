package Constractor;

public class Example {
    private int var;
    public Example(){
        var= 10;

    }
    public Example(int num){
        this.var = num;
    }

    public static void main(String[] args) {
        Example e = new Example ();
        System.out.println (" Var is "+e.var);
        Example e2 = new Example (100);
        System.out.println ("The var is "+e2.var);
    }
}
