import java.util.Scanner;
public class ExInheritate1 extends ExInheritate{

    public void obey() {
        System.out.println("Message Inherited form Exheritate1 ");
    }

    void Reply(){
        System.out.println("New message Inherited form Exheritate1");
    }
    /*
    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the command : ");
        int s1 = sc.nextInt();

        if(s1==1){
            System.out.println("hi");
        }
        else{
            System.out.println("hello");
        }
    }
     */
}
