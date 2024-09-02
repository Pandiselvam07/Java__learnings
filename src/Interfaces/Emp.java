package Interfaces;

public class Emp implements Detail {
    private int id;

    public void emp(){
        System.out.println("Employee name : Pandiselvam R");
    }
    public void info(){
        System.out.println("From sivakasi");
    }
    public Emp(int id){
        System.out.println("Constructor Running!!! ");
        this.id=id;
    }
}
