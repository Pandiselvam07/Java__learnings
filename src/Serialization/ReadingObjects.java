package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjects {
    public static void main(String[] args){
        System.out.println("Reading Objects");

        try {
            FileInputStream fi = new FileInputStream("Serialization.bin");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Program p1 = (Program)oi.readObject();
            Program p2 = (Program)oi.readObject();

            System.out.println(p1);
            System.out.println(p2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
