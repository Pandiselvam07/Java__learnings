package CreatingandWritingFiles;

import java.io.*;

public class CreatingandWritingFiles {
    public static void main(String[] args){
        File file = new File("C://Users//rpand//IdeaProjects//Java//src//CreatingandWritingFiles//demoFile");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("First line" + "\n");
            bw.write("Second line");
            bw.newLine();
            bw.write("Last line");
        }
        catch (IOException e){
            System.out.println("IO Exception");
        }
        try {
            //File file1 = new File("C://Users//rpand//IdeaProjects//Java//src//CreatingandWritingFiles//demoFile");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("IO exception");
        }
    }
}
