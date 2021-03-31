package ReverseArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Assignment3Q3 {
   public static void main(String[] args){
    List<String>arr=new ArrayList<String>(Arrays.asList("Steve","Max","Ron","Adam"));
    Iterator<String> it= arr.iterator();
    while(it.hasNext()){
        String st= it.next();
        StringBuilder sb =new StringBuilder();
         sb.append(st);
         sb.reverse();
         System.out.println(sb);
    }
   }
    
}

