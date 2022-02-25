package lab07;
/**
 * Josh Parker
 * CS 2300
 * Lab 07:
 * TwoInts class
 * 2/25/22
 */
public class TwoInts {

    private final int a;
    private final int b;

    public TwoInts (int a, int b){
        this.a = a;
        this.b = b;

    }
    public TwoInts (int both){
        this(both, both);
    }
    public TwoInts(){
        this(0 , 0);
    }
    public String toString(){
        return "< " + a + ", " + b + " >";
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }

    public boolean aIsPos(){
        if (getA() > 0){
            return true; //true because a is positive and greater than 1
        }
        else {
            return false; // not true (negative)
        }
    }
    // the same method for b
    public boolean bIsPos(){
        if (getB() > 0){
            return true; //true because B is positive and greater than 1
        }
        else {
            return false; // not true (negative)
        }
    }
    public static void main(String[] args) {
        System.out.println("Start of main!\n");
        TwoInts blue = new TwoInts(4, 11);
        System.out.println("blue = " + blue);
        TwoInts green = new TwoInts(14, -1);
        System.out.println("green = " + green);
        TwoInts one = new TwoInts(144);
        System.out.println("one = " + one);
        TwoInts zero = new TwoInts();
        System.out.println("zero = " + zero);
        System.out.println("blue.A is: " + blue.getA()); // return a copy of the field a
        System.out.println("blue.b is: " + blue.getB()); // return a copy of the field b
        // checking to see if the green integers are positive or negative
        if (green.aIsPos()){
            System.out.println("Yep!");
        } else {
            System.out.println("Nope!");
        }
        if (green.bIsPos()){
            System.out.println("Yep b is positive!");
        } else {
            System.out.println("Nope! b is negative!");
        }
        System.out.println("\nbye!");
    }
}
