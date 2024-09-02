class Learn{
    private int num;
    private String name;

    public Learn(String name,int num){
        this.name=name;
        this.num=num;
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(name+"\n");
        sb.append(num);
        System.out.println(name+" : "+num);
        return sb.toString();
    }
}

public class ToStringMethod {
    public static void main(String[] args){
        Learn l1 = new Learn("Pandi",7);
        System.out.println(l1);
    }
}

