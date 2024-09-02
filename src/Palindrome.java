import java.util.Scanner;
public class Palindrome {

    public  static Integer pal(Integer value){
        int reverse=0;
        while(value != 0)
        {
            int remainder = value % 10;
            reverse = reverse * 10 + remainder;
            value = value/10;
        }
        return reverse;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a palindrome : ");
        int value =sc.nextInt();
        int reversedValue = pal(value);
        System.out.println("Entered value : "+value);
        System.out.println("Reversed value : "+reversedValue);
        if(reversedValue==value)
            System.out.println("The given number is palindrome");
        else
            System.out.println("The given number is not a palindrome");
    }
}
