import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] ags){
        Set<String> hashset = new HashSet<String>();
        hashset.add("Pandi");
        hashset.add("Dinesh");

        Set<String> linkedhashset = new LinkedHashSet<String>();
        linkedhashset.add("Dhoni");
        linkedhashset.add("Kholi");

        System.out.println(hashset);
        System.out.println(linkedhashset);

        for (String elementsinhashset : hashset){
            System.out.println(elementsinhashset);
        }

        for (String elementsinlinkedhashset : linkedhashset) {
            System.out.println(elementsinlinkedhashset);
        }
    }
}
