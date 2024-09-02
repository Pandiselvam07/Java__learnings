package Polymorphism;

public class Polymorphism {
    public static void main(String[] args){
        Tree t0 = new Tree();
        Neem n0 = new Neem();
        Tree t1 = n0;
        t1.growth();
    }
}
