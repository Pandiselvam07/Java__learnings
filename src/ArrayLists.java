import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        //arr.add(7);
        //arr.add(18);
        //arr.add(45);
        System.out.println("Enter the total value to be added : ");
        int Totalvalue =sc.nextInt();

        for(int a =0;a<Totalvalue;a++){
            System.out.println("Enter the value : ");
            int value = sc.nextInt();
            arr.add(value);
        }

        System.out.println("Iteration #1");

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        System.out.println("\nIteration #2");

        for(Integer arr1: arr){
            System.out.println(arr1);
        }

        System.out.println("\nIteration #3");

        try {
            arr.remove(arr.size() - 1);
            for (Integer arr1 : arr) {
                System.out.println(arr1);
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("\nIndex out of Bound");
        }
    }
}