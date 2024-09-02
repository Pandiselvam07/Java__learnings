class Series_1 {
    public void Ep1(){
        System.out.println("Episode 1 from Series 1 playing");
    }
}
interface Series_2{
    public void Ep_2();
}
public class AnonymousClass {
    public static void main(String[] args){
        Series_1 s_1 = new Series_1(){
            public void Ep1(){
                System.out.println("Episode 2 from Series 1 playing");
            }
        };
        s_1.Ep1();

        Series_2 s_2 = new Series_2() {
            @Override
            public void Ep_2() {
                System.out.println("Episode 1 from Series 2 playing");
            }
        };
        s_2.Ep_2();
    }
}
