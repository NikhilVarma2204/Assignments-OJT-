package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Assignment3Q1 {
    public static void main(String [] args){
       Person p1 = new Person();
       Person p2 = new Person();
       Person p3 = new Person();
       Person p4 = new Person();
       Person p5 = new Person();
      p1.name="Albert";
       p1.height=5.4;
       p1.weight=60; 
        p2.name="Becca";
       p2.height=5.4;
       p2.weight=45;
       p3.name="Ronald";
       p3.height=5.9;
       p3.weight=70;
       p4.name="Tom";
       p4.height=6.0;
       p4.weight=60; 
       p5.name="Steve";
       p5.height=5.8;
       p5.weight=67;
      
       TreeSet<String> set= new TreeSet<String>();
       set.add(p1.name);
       set.add(p2.name);
       set.add(p5.name);
       set.add(p2.name);
       set.add(p3.name);
      // System.out.println(set);
      Iterator <String> i=set.iterator();
      while(i.hasNext()){
          String str=i.next();
          System.out.println(str);
      }
       System.out.println("The Tree Set of Weights");
       TreeSet<Integer> weightSet= new TreeSet<Integer>();
       weightSet.add(p1.weight);
       weightSet.add(p2.weight);
       weightSet.add(p4.weight);
       weightSet.add(p5.weight);
       weightSet.add(p3.weight);     
       

     

    }

    
}
