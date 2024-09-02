package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObjects {
    public static void main(String[] args){
        System.out.println("Writing Onjects");
        Program Pandi = new Program(7,"Pandi");
        Program Dinesh = new Program(7,"Dinesh");

        System.out.println(Pandi);
        System.out.println(Dinesh);

        try {
            FileOutputStream fs = new FileOutputStream("Serialization.bin");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(Pandi);
            os.writeObject(Dinesh);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}