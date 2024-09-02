package SerializingArrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WritingObjects {
    public static void main(String[] args){
        System.out.println("WritingObjects");

        Program[] People = {new Program(1,"Aditiya"),new Program(2,"Ravan")};
        ArrayList<Program> Peoplelist = new ArrayList<Program>(Arrays.asList(People));

        try(FileOutputStream fo = new FileOutputStream("SerializingArrays.bin")){
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(People);
            os.writeObject(Peoplelist);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
