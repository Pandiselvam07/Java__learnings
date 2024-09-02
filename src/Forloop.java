import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {

        Scanner value =new Scanner(System.in);
        System.out.println("Enter the value : ");
        int i = value.nextInt();
        for( i =i; i < 5; i++) {
            System.out.println("The value of i is : " + i);
            //System.out.printf("The value of i is: %d\n", i);
        }
    }
}