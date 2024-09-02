import java.util.Objects;

class Equ {
    private int id;
    public String name;

    public Equ(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Machine [Id : "+id+"Name : "+name+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equ equ = (Equ) o;
        return id == equ.id && Objects.equals(name, equ.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class Equalsmethod{
    public static void main(String[] args){
        Equ equ1 = new Equ(7,"Pandi");
        Equ equ2 = new Equ(7,"Pandi");
        System.out.println(equ1);
        System.out.println(equ2);

        if(equ1.equals(equ2)){
            System.out.println("Yeah its equal");
        }
        else {
            System.out.println("Its not equal");
        }

        //System.out.println(equ1.equals(equ2));
    }
}
