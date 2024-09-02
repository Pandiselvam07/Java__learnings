class India{
    private static long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void Tamilnadu(){
        System.out.println("Welcome to Tamilnadu ");
    }
    public class Kerela{
        public void Palakkad(){
            System.out.println("Welcome to Palakkad : "+id);
        }
    }
    public static class Karnataka{
        public void Bengaluru(){
            System.out.println("Welcome to Bengalure : "+id);
        }
    }
}

public class Innerclass {
    public static void main(String[] args){
        India ind = new India();
        ind.Tamilnadu();
        India.Kerela kel = ind.new Kerela();
        ind.setId(678001);
        kel.Palakkad();
        India.Karnataka kar = new India.Karnataka();
        ind.setId(560001);
        kar.Bengaluru();

    }
}
