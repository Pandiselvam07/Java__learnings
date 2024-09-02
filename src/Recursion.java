public class Recursion {
    public static void main(String[] args){
        calculate(4);
    }
    private static void calculate(int value){
        System.out.println(value);
        if(value==0) {
            return;
        }
            calculate(value - 1);
        //System.out.println(value);
    }
}
