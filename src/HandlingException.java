import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandlingException {
    public static void main(String[] args){
        String Filename ="text.txt";
        File textfile = new File("text.txt");
        try {
            Scanner sc = new Scanner(textfile);
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Error! File not found");
        }
    }
}
