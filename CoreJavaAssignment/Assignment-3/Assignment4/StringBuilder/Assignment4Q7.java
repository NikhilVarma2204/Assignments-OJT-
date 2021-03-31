package StringBuilder;

import java.util.HashMap;
import java.util.Iterator;

public class Assignment4Q7 {
    public static void main(String[] args){
        HashMap<String,Integer>map= new HashMap<String,Integer>();
        map.put("Adam",33);
        map.put("Steve",20);
        map.put("Ron",25);
        System.out.println("The set of this hash map is "+map.entrySet());
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(map));
    }
}
