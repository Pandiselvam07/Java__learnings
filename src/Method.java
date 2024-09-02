import java.util.Scanner;

class Student {
    int Age;
    String Name;

    void say() {
        for(int i=0;i<1;i++) {
            System.out.println("Hello welcome" + "\n" + "Your name is " + Name + "\n" + "Your age is " + Age);
        }
    }
}
public class Method {
    public static void main(String[] args){

        Student person1 = new Student();
        person1.Name = "Pandiselvam R";
        person1.Age = 21;
        person1.say();

        System.out.println("---------------------------");

        Student person2 = new Student();
        person2.Name = "Dineshkumar R";
        person2.Age = 22;
        person2.say();

    }
}
