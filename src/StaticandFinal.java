class thing{
    String name;
    static int num;
    final static String Alpha="Dinesh";
    final static int myFavoritenum=7;
    static int count=1;
    static int id;

    public thing(){
        id = count;
        count++;
    }

    void displayname(){
        System.out.println("Object ID : " +id+ "\nName : " +name);
    }
    static void displayint(){
        System.out.println(num);
    }
}

public class StaticandFinal {
    public static void main(String[] args){
        System.out.println("Before creating object : "+ thing.count);
        thing thing1 = new thing();
        thing1.name="Pandi";
        thing1.displayname();
        thing thing2 = new thing();
        thing2.name="Dinesh";
        thing2.displayname();
        thing.num=7;
        //System.out.println(thing.num);
        thing.displayint();
        System.out.println(thing.Alpha);
        System.out.println(thing.myFavoritenum);
        System.out.println("After creating object : "+ thing.count);
    }
}
