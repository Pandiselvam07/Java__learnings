import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        int reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a palindrome : ");
        int value =sc.nextInt();
        int temp=value;
        while(value != 0)
        {
            int remainder = value % 10;
            reverse = reverse * 10 + remainder;
            value = value/10;
        }
        System.out.println("Entered value : "+temp);
        System.out.println("Reversed value : "+reverse);
        if(reverse==temp)
            System.out.println("The given number is palindrome");
        else
            System.out.println("The given number is not a palindrome");
    }
}
