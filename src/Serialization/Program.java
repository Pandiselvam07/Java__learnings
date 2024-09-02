package Serialization;

import java.io.Serializable;

public class Program implements Serializable {
    private /*transient*/int id;
    private String name;

    public Program(int id , String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person 1 name : "+name+"\nPerson 1 id : "+id;
    }
}
