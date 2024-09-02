package ReadsfileusingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadsfileusingScanner {
    public static void main(String[] args) throws FileNotFoundException {
        String Filename ="C://Users//rpand//IdeaProjects//Java//src//ReadsfileusingScanner//exforReadingFiles.txt";
        //String Filename ="exforReadingFiles.txt";
        File textfile =new File(Filename);
        Scanner sc = new Scanner(textfile);
        int count=1;
        String firstword =sc.nextLine();
        System.out.println(count+" : "+firstword);
        count=count+1;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(count+" : "+line);
            count++;
        }
        //sc.close();
    }
}