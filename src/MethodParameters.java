class AI {
    void tell(String x){
        System.out.println(x);
    }
    void movement(int y,String z,float a){
        System.out.println("Move "+y+" meters in "+z+" direction at "+a+" AM");
    }

}

public class MethodParameters {
    public static void main(String[] args){
        AI Gold = new AI();
        Gold.tell("Good morning");
        Gold.movement(5,"North",3.45f);
    }
}
