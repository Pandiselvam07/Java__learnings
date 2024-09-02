import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int value = sc.nextInt();

        while(value < 10)
        {
            System.out.println("Hello " + value);

            value = value + 1;
        }
    }
}
