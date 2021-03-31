package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BankAcoount_List extends SavingAcoount {
    void accountDetails(List<String> set) {
        
        System.out.println("The account balance is "+set.get(0));
        System.out.println("The account id is "+set.get(1));
        System.out.println("The account holder is "+set.get(2));
        System.out.println("The account is savings account? ");
        if (set.get(3).equals("Savings Account")){ System.out.println("True");}
       
    }
}
