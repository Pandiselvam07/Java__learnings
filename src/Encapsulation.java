class Encap {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Encapsulation {
    public static void main(String[] args){
        Encap en = new Encap();
        en.setId(7);
        en.setName("Pandi");
        System.out.println(en.getId());
        System.out.println(en.getName());

    }
}
