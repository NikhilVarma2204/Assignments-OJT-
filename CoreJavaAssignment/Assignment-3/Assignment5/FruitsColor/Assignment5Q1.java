package Assignment5.FruitsColor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Assignment5Q1{
    
    public static String colorRed(ArrayList<Fruits>l){
        ArrayList<String> a= new ArrayList<String>();
        List<Fruits> li = l.stream().filter(Fruits -> Fruits.color == "Red").collect(Collectors.toList());
        for(Fruits f:li){
            a.add(f.name);
        }
        System.out.println(a);
        return null;
    }
    public static String findCalories(ArrayList<Fruits>l){
        ArrayList<String> b =new ArrayList<String>();
        List<Fruits>li=l.stream().filter(Fruits -> Fruits.calories<100).collect(Collectors.toList());
        for(Fruits f:li){
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
