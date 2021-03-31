package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Assignment3Q9 {
    public static void main(String[] args){
        List<String> set=new ArrayList<String>();
        set.add("10000");
        set.add("12");
        set.add("Adam");
        set.add("Savings Account");
        
        BankAcoount_List b= new BankAcoount_List();
        b.accountDetails(set);
        }
}
