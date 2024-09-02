import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {
    public static void main(String[] args) {
        Map<Integer, String> Hashmap = new HashMap<Integer, String>();
        Map<Integer, String> Linkedhashmap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> Treemap = new TreeMap<Integer, String>();

        testmap(Hashmap);
        //testmap(Linkedhashmap);
        //testmap(Treemap);
    }
    public static void testmap(Map<Integer,String>map){
        map.put(7,"Dhoni");
        map.put(18,"Virat");
        map.put(45,"Rohit");
        for(Integer key : map.keySet()){
            String name = map.get(key);
            System.out.println(key+" : "+name);
        }
    }

}
