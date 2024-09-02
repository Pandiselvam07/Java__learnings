package AbstractClass;

public class AbstractClass {
    public static void main(String[] args){

        Jets j1 = new Jets();
        j1.setId(1);
        System.out.println(j1.getId());
        j1.run();
        Cars c1 = new Cars();
        c1.setId(2);
        System.out.println(c1.getId());
        c1.run();

    }
}
