package SerializingArrays;

import java.io.Serializable;

public class Program implements Serializable {
    private /*transient*/ int id;
    private String name;

    public Program(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person 1 ID : "+id+"\nPerson 1 NAME : "+name;
    }
}
