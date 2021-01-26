package Assignment5.FruitsColor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment5Q1{
    
    public static String colorRed(ArrayList<Fruits>l){
        ArrayList<String> a= new ArrayList<String>();
        for(Fruits f:l){
            if(f.color=="Red"){
                a.add(f.name);
                
            }
        }
        System.out.println(a);
        return null;
    }
    public static String findCalories(ArrayList<Fruits>l){
        ArrayList<String> b =new ArrayList<String>();
        for(Fruits f:l){
            if(f.calories<100){
                b.add(f.name);
            }
        }
        System.out.println(b);
        return null;
    }
    

    public static void main(String[] args) {
        
        ArrayList<Fruits> a = new ArrayList<Fruits>();
        Fruits f = new Fruits("Apple", 85, 100, "Red");
        Fruits g = new Fruits("banana", 100, 60, "Yellow");
        a.add(f);
        a.add(g);
        findCalories(a);
        colorRed(a);
        
    }
}
