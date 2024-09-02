package AbstractClass;

public abstract class Machine {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void Typesofmachines();
    public abstract void IndianManufacturers();

    public void run(){
        Typesofmachines();
        IndianManufacturers();
    }
}
