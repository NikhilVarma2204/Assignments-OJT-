package ParkingLot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment3Q7 {
    public static void main(String[] args){
        List<String> l=new ArrayList<String>(Arrays.asList("Max","Swift","MH 20 AB 9999","7994456587","Mumbai","level-1","Slot-A","18"));
        Parked_CarOwnerList p= new Parked_CarOwnerList();
       // p.add_new_car(l);
        p.getData(l);
        
    }
}