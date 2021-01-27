package FirstLetter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.*;



public class Assignment4Q5 {
    public static void main(String[] args){
        List<String>list=new ArrayList<String>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String st= it.next();
            System.out.println(st);
            StringFirst q = new StringFirst();
            q.getFirst(st);
        }
       
    }

}
