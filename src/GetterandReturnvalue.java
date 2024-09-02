class Animal {
    int Age;
    String Name;

    void tell() {
        System.out.println("Animal : "+Name +"\n"+"Age : "+ Age);
    }

    int lifeSpan(){
        int yearsleft = 20-Age;
        //System.out.println("Years remaining : "+yearsleft);
        return yearsleft;
    }
    String getName() {
        return Name;
    }
    int getAge() {
        return Age;
    }
}
public class GetterandReturnvalue {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        animal1.Name = "Tiger";
        animal1.Age = 7;
        animal1.tell();
        int y = animal1.lifeSpan();
        System.out.println("Lifespan : "+y);
        int Age = animal1.getAge();
        String Name=animal1.getName();
        System.out.println(Name);
        System.out.println(Age);
    }
}
