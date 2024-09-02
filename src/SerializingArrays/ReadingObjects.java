package SerializingArrays;

import java.io.*;
import java.util.ArrayList;

public class ReadingObjects {
    public static void main(String[] args){
        System.out.println("ReadingObjects");

        try(FileInputStream fi = new FileInputStream("SerializingArrays.bin")){
            ObjectInputStream oi = new ObjectInputStream(fi);


            Program[] People =(Program[])oi.readObject();
            ArrayList<Program> PeopleList =(ArrayList<Program>)oi.readObject();

            for(Program peo : People){
                System.out.println(peo);
            }
            for(Program peo1 : PeopleList){
                System.out.println(peo1);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
