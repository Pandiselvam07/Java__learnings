import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterators {
    public static void main(String[] args){
        List<String> list = new LinkedList<String>();

        list.add("hi");
        list.add("hello");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String values = it.next();
            System.out.println(values);
        }
    }
}
