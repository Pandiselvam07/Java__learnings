import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLenghtComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();

        if (len1 > len2) {
            return 1;
        }
        if (len1 < len2) {
            return -1;
        }
        return 0;
    }
}

public class SortingLists {
    public static void main(String[] args){
        List<String> arraylist = new ArrayList<String>();
        arraylist.add("Hi");
        arraylist.add("Hello");
        arraylist.add("Hola");
        arraylist.add("Ciao");

        Collections.sort(arraylist,new StringLenghtComparator());
        System.out.println(arraylist);

        for(String arr : arraylist) {
            System.out.println(arr);
        }
    }
}
