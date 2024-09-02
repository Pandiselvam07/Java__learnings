import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter command : ");
        String Command = input.nextLine();

        switch(Command){
            case "START":
                System.out.println("Machine has started");
                break;
            case "STOP":
                System.out.println("Machine has stoped");
                break;
            default:
                System.out.println("Command not recognised");
        }
    }
}
