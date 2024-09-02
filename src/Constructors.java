class cons{
    private String name;
    private int num;

    public cons(){
        //this("pandi",7);
        System.out.println("1st Constructor running!!!");
        name="Pandi";
    }
    public cons(String name){
        System.out.println("2nd Constructor running!!!");
        this.name=name;
    }
    public cons(int num){
        System.out.println("3rd Constructor running!!!");
        this.num=num;
    }
    public cons(String name1,int num1) {
        System.out.println("4th Constructor running!!!");
        this.name = name1;
        this.num = num1;
    }
}

public class Constructors {
    public static void main(String[] args){
        cons cons1 = new cons();
        cons cons2 = new cons("Dinesh");
        cons cons3 = new cons(7);
        cons cons4 = new cons("Pandi",7);
    }
}
