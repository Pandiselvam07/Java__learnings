package ReadingFileswithFileReader;

import java.io.*;

public class ReadingFileswithFileReader {
    public static void main(String[] args){
        File file = new File("C://Users//rpand//IdeaProjects//Java//src//ReadingFileswithFileReader//textfile.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String Readfile;
            while((Readfile=br.readLine()) != null){
                //String Readfile = br.readLine();
                System.out.println(Readfile);
            }
            //br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");
        }catch (IOException e){
            System.out.println("IO exception ");
        }
    }
}
