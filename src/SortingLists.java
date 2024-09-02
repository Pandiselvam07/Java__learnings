import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLenghtComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();

        return Integer.compare(len1, len2);
    }
}

public class SortingLists {
    public static void main(String[] args){
        List<String> arraylist = new ArrayList<String>();
        arraylist.add("Hi");
        arraylist.add("Hello");
        arraylist.add("Hola");
        arraylist.add("Ciao");

        arraylist.sort(new StringLenghtComparator());
        System.out.println(arraylist);

        for(String arr : arraylist) {
            System.out.println(arr);
        }
    }
}
