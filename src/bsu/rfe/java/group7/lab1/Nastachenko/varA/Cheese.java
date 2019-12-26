package bsu.rfe.java.group7.lab1.Nastachenko.varA;

public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(this + " has eaten");
    }

    public int calculateCalories(){
        return 80;
    }

}
