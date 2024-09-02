class Employee{
    private String Name;
    private int Age;

    void setEmpName(String Name){
        this.Name=Name;
    }
    void setEmpAge(int Age){
        this.Age=Age;
    }

    void search(){
        System.out.println("Your Name : "+Name+ "\n" +"Your Age : "+Age);
    }
}
public class SettersandThis {
    public static void main(String[] args){
        Employee emp= new Employee();
        //emp.Name="Pandiselvam R";
        //emp.Age=21;
        emp.setEmpName("Pandiselvam R");
        emp.setEmpAge(21);
        emp.search();
    }
}
