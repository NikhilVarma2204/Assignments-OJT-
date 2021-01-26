package Assignment5.WorkingCities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Assignment5Q3 {
    public static ArrayList<String> printUniquecities(ArrayList<Trader> l) {
        HashSet h = new HashSet<String>();
        for (Trader t : l) {
            
            h.add(t.city);
        }
        System.out.println(h);
        return null;
    }

    public static ArrayList<String> tradersFrompune(ArrayList<Trader> l) {
        for (Trader r : l) {
            if (r.city == "Pune") {
                System.out.println(r.name);
            }
        }
        return null;
    }

    public static String alphabeticalOrder(ArrayList<Trader> l) {
          List<String>q=new ArrayList();
          for(Trader t: l){
              q.add(t.name);
          }
          Collections.sort(q);
          System.out.println(q);
        
            return "check your operation";
        }
        public static boolean tradersIndore(ArrayList<Trader>l){
           for(Trader t:l){
               if(t.city=="Indore"){System.out.println("true");}
           }
            return false;
        }
        public static List<Integer> transactionsValuesDelhi(List<Transaction> t) {
           
            return null;
        }
    public static void main(String[] args){
        ArrayList<Trader>list=new ArrayList<Trader>();
        ArrayList<Trader>list1=new ArrayList<Trader>();
        Trader t1= new Trader("Ravi","Indore");
        Trader t2= new Trader("Navneet","Mumbai");
        Trader t3= new Trader("Naveen","Pune");
        Trader t4= new Trader("Rakesh","Delhi");
        Trader t5= new Trader("Sandeep","Hyderabad");
        Trader t6= new Trader("Harpreet","Pune");
        Transaction u1 = new Transaction(t1,2020,20000);
        Transaction u2 = new Transaction(t2,2020,20300);
        Transaction u3 = new Transaction(t3,2020,24000);
        Transaction u4 = new Transaction(t4,2020,20001);
        Transaction u5 = new Transaction(t5,2020,25000);
        Transaction u6 = new Transaction(t6,2020,27000);
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list1.add(u1);
        list1.add(u2);
        list1.add(u3);
        list1.add(u4);
        list1.add(u5);
        list1.add(u6);
        for(Trader trader: list){
            System.out.println("The trader name is: "+trader.name+" and he/she works at: "+trader.city);
        }
         tradersFrompune(list);
          alphabeticalOrder(list);
          tradersIndore(list);
          printUniquecities(list);
    }
}
