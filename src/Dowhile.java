import java.util.Scanner;
public class    Dowhile {
    public static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);

        int value=0;
        do{
            System.out.println("Enter the value : ");
            value = scanner.nextInt();
        }
        while(value !=5);
            System.out.println("we got 5");
    }
}
