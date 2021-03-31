package Assignment5.NewsPaper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment5Q2 {
    public static int maxComments(List<News>l){
        List<Integer>y=new ArrayList<Integer>();
        List<News> li= l.stream().collect(Collectors.toList());
        for(News n:li){
            y.add(n.newsId);
        }
        int freq1= Collections.frequency(y,1);
        int freq2= Collections.frequency(y,2);
        if(freq1>freq2){
            System.out.println(1);
        }
        else if(freq1<freq2){
        System.out.println(2);}   
        return 0;
    }
    public static int searchBudget(List<News>l){
        ArrayList<String> a = new ArrayList<String>();
        List<News> li= l.stream().filter(News -> News.commentByUser.contains("budget")).collect(Collectors.toList());
       for(News n: li){
           a.add(n.commentByUser);
       }
       int freq= Collections.frequency(a,"budget");
       System.out.println(freq);
        return 0;
    }
    public static String maxCommentByUser(List<News>l){
        ArrayList<String>s=new ArrayList<String>();
        
        for(News n: l.stream().collect(Collectors.toList())){
            s.add(n.postedByUser);
        }
        int f1= Collections.frequency(s,"Max");
        int f2= Collections.frequency(s,"Adam");
        int f3= Collections.frequency(s,"Aron");
        if(f1>f2&f1>f3){System.out.println("Max");}
        if(f2>f1&f2>f3){System.out.println("Adam");}
        if(f3>f1&f3>f2){System.out.println("Aron");}
        return null;
    }
    public static void main(String[] args){
      List<News>list= new ArrayList<News>();
       News n1= new News(1,"Adam","this news is boring","he is correct!!");
       News n2= new News(2,"Max","this news is interesting","Maybe he is correct!!");
       News n3= new News(1,"Max","this news is boring","he is correct!!");
       News n4= new News(1,"Aron","budget","he is correct!!");
       
       list.add(n1);
       list.add(n2);
       list.add(n3);
       list.add(n4);
              
      searchBudget(list);
      maxComments(list);
      maxCommentByUser(list);
    }
}
