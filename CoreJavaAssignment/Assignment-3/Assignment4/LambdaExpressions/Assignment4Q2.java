package LambdaExpressions;
import java.util.ArrayList;

public class Assignment4Q2 {
    public static void main(String[] args){
       ArrayList<Orders> arr=new ArrayList<Orders>();
      Orders o1=new Orders(12000);
      o1.showData();
      Orders o2=new Orders(10000);
      o2.showData();
      Orders o3=new Orders(2000);
      o3.showData();
      arr.add(o1);
      arr.add(o2);
      arr.add(o3);
      
      for(Orders o:arr){
          System.out.println(arr);
      }
      
}
}
