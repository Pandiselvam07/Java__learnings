class Grade12{
    public void sname() {
        System.out.println("Jack");
    }
}
class College extends Grade12{
    public void sname(){
        System.out.println("Will");
    }
    public void sid(){
        System.out.println(10);
    }
}

public class UpcastingandDowncasting {
    public static void main(String[] args){
        Grade12 g12_0 = new Grade12();
        g12_0.sname();
        College c_0 = new College();
        c_0.sname();
        c_0.sid();

        // Upcasting
        Grade12 g12_1 = c_0;
        g12_1.sname();

        // Downcasting
        Grade12 g12_2 = new College();
        College c_1 = (College)g12_2;
        c_1.sname();
        c_1.sid();
    }
}
