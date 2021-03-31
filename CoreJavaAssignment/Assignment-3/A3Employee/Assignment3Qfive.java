package A3Employee;

import java.util.HashMap;



public class Assignment3Qfive {
    public static void main(String[] args){
        HashMap<String,Integer> set = new HashMap<String,Integer>();
        set.put("Adam",1);
        set.put("Steve",2);
        System.out.println(set);
        Employee e= new Employee();
        e.equals(set);
        e.hashCode();
    }
}
