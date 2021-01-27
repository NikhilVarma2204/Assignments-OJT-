package removeif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Iterator;

public class Assignment4Q4 {
    public static void main(String[] args){
        ArrayList <String> arr=new ArrayList<String>();
        arr.add("steve");
        arr.add("Aaron");
        arr.add("Gray");
        Iterator<String>it= arr.iterator();
        while(it.hasNext()){
            it.removeIf(it.length()%10!=0);
            String st= it.next();
             
            }
            System.out.println(arr);
            }
           
            
        }
        
   

    

