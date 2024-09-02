package Try_with_resources;

import java.io.*;

public class Try_with_resources {
    public static void main(String[] args){
        File file = new File("C://Users//rpand//IdeaProjects/Java/src//Try_with_resources//Textfile.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to open file");
        }

    }
}
