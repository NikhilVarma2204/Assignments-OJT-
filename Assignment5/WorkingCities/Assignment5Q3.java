package Assignment5.WorkingCities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Assignment5Q3 {
    public static ArrayList<String> printUniquecities(ArrayList<Trader> l) {
        HashSet h = new HashSet<String>();
        List<Trader>li=l.stream().collect(Collectors.toList());
        for (Trader t : li) {
            
            h.add(t.city);
        }
        System.out.println(h);
        return null;
    }

    public static ArrayList<String> tradersFrompune(ArrayList<Trader> l) {
        List<Trader>li=l.stream().filter(Trader->Trader.city=="Pune").collect(Collectors.toList());
        for (Trader r : li) {
            System.out.println(r.name);
        }
        
        return null;
    }

    public static String alphabeticalOrder(ArrayList<Trader> l) {
          List<String>q=new ArrayList();
          List<Trader>li=l.stream().sorted(Comparator.comparing(Trader->Trader.name)).collect(Collectors.toList());
          for(Trader t: li){
              q.add(t.name);
          }
          Collections.sort(q);
          System.out.println(q);
        
            return "check your operation";
        }
        public static boolean tradersIndore(ArrayList<Trader>l){
            HashSet h = new HashSet<String>();
            List<Trader>li=l.stream().filter(Trader->Trader.city=="Pune").collect(Collectors.toList());
            for(Trader t:li){
               System.out.println("true");
           }
            return false;
        }
        public static List<Transaction> sortTransactions(List <Transaction> transactions) {
            List<Integer>l = new ArrayList<>();
            for(Transaction t: transactions){
                if(t.year==2011){l.add(t.value);}
            }
            System.out.println(l);
            return transactions;
        }
        public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
            List<Integer>l = new ArrayList<>();
            for(Transaction t: transactions){
                if(t.trader.city=="Delhi"){l.add(t.value);}
            }
            System.out.println(l);
            return null;
        }
        public static int highestTransaction(List<Transaction> transactions){
            List<Integer>l = new ArrayList<>();
            int temp=0;
            for(Transaction t: transactions){
                l.add(t.value);
            }
            for(int t1: l){
                if(t1>temp){
                     temp=t1;
                    }
            }
            System.out.println(temp);
            return 0;
        }
        public static int smallestTransaction(List<Transaction> transactions){
            List<Integer>l = new ArrayList<>();
            List<Integer>l1 = new ArrayList<>();
            int temp=0;
            int temp1=0;
            for(Transaction t: transactions){
                l.add(t.value);
            }
            for(int t1: l){
               temp= t1-(t1*2);
               if(t1<temp){
                   temp=t1;
                   l1.add(temp);
               }
            }
            for(int t2: l1){
                t2= t2+(t2*2);
                if(t2>temp1){
                     temp1=t2;
                    }
            }
            System.out.println(temp1);
           
            return 0;
        }
       
    public static void main(String[] args){
        ArrayList<Trader>list=new ArrayList<Trader>();
        ArrayList<Transaction>list1=new ArrayList<Transaction>();
        Trader t1= new Trader("Ravi","Indore");
        Trader t2= new Trader("Navneet","Mumbai");
        Trader t3= new Trader("Naveen","Pune");
        Trader t4= new Trader("Rakesh","Delhi");
        Trader t5= new Trader("Sandeep","Hyderabad");
        Trader t6= new Trader("Harpreet","Pune");
        Transaction u1 = new Transaction(t1,2011,25000);
        Transaction u2 = new Transaction(t2,2011,20000);
        Transaction u3 = new Transaction(t3,2011,28000);
        Transaction u4 = new Transaction(t4,2011,20700);
        Transaction u5 = new Transaction(t5,2011,40000);
        Transaction u6 = new Transaction(t6,2011,26000);
        list1.add(u1);
        list1.add(u2);
        list1.add(u3);
        list1.add(u4);
        list1.add(u5);
        list1.add(u6);
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        list.add(t6);
       
        for(Trader trader: list){
           // System.out.println("The trader name is: "+trader.name+" and he/she works at: "+trader.city);
        }
         tradersFrompune(list);
          alphabeticalOrder(list);
          tradersIndore(list);
          printUniquecities(list);
       sortTransactions(list1);
       transactionsValuesDelhi(list1);
      highestTransaction(list1);
      smallestTransaction(list1);
    }
}
