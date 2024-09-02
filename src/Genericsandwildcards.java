import java.util.ArrayList;
class machine {
    public String toString() {
        return "Machine 1 started";
    }
    public void Start(){
        System.out.println("Machine 2 started");
    }
}
class camera extends machine{
    @Override
    public String toString() {
        return "Shot 1 taken";
    }
    public void Taken(){
        System.out.println("Shot 2 taken");
    }
}

public class Genericsandwildcards {
    public static void main(String[] args){
        ArrayList<machine> Arr1 = new ArrayList<machine>();
        Arr1.add(new machine());
        Arr1.add(new machine());
        System.out.println(Arr1);

        ArrayList<camera> Arr2 = new ArrayList<camera>();
        Arr2.add(new camera());
        Arr2.add(new camera());
        System.out.println(Arr2);

        showList(Arr1);
        showList1(Arr2);
    }

    public static void showList(ArrayList<? extends machine> Arr1) {
        for(machine mach : Arr1){
            System.out.println(mach);
            mach.Start();
        }
    }
    public static void showList1(ArrayList<camera> Arr2){
        for(camera cam : Arr2){
            System.out.println(cam);
            cam.Taken();
        }
    }
}
