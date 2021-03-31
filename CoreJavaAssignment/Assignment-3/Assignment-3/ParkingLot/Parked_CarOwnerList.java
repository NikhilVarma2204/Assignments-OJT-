package ParkingLot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parked_CarOwnerList extends ParkingSlot {
    
    void add_new_car(List<String> l){
       Iterator it= l.iterator();
       while(it.hasNext()){
           Object str = it.next();
           
       }
       }
       void getData(List<String> l){
               System.out.println("the owner is "+l.get(0));
               System.out.println("the car model is "+l.get(1));
               System.out.println("the car no is "+l.get(2));
               System.out.println("the owner's mobile number is "+l.get(3));
               System.out.println("the owner's address is "+l.get(4));
               System.out.println("the car is parked in "+l.get(5));
               System.out.println("the car is parked in  "+l.get(6));
               System.out.println("the token no of the car is "+l.get(7));
       }
       void removeDetails(List<String> l){
           l.clear();
       }
    }

