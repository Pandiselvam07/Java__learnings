import java.util.ArrayList;
public class Generics {
    public static void main(String[] args){
        ArrayList Arr = new ArrayList();
        Arr.add("Apple");
        Arr.add("Orange");
        Arr.add("Mango");
        String arr1 = (String) Arr.get(2);
        System.out.println(arr1);
        /*
        for(int i=0;i<3;i++) {
            String arr1 = (String) Arr.get(i);
            System.out.println(arr1);
        }

         */
        ArrayList<String> Arr2 = new ArrayList<String>();
        Arr2.add("Carrot");
        Arr2.add("Beans");
        Arr2.add("Tomato");
        String arr2 = Arr2.get(2);
        System.out.println(arr2);
        System.out.println("\n------------------------------------");
        for(String text : Arr2){
            System.out.println("\n"+text);
        }
    }
}
