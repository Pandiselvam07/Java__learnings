class Person {
    int Age;
    String Name;
}
public class ClassesObjects {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        animal1.Name = "Pandiselvam R";
        animal1.Age = 21;

        Animal animal2 = new Animal();
        animal2.Name = "Dineshkumar R";
        animal2.Age = 22;

        System.out.println(animal1.Name +"  "+ animal2.Name);
    }
}
