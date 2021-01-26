package TaxAmount;
import java.util.*;

public class Main {
   public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int amount = s.nextInt();
    System.out.println(amount);
     if(amount<=180000){
        System.out.println("No tax to be paid!");
    }
     else if(amount>180000&&amount<=300000){
        System.out.println("Tax to be paid is "+(amount*0.1));
    }
     else if(amount>300000&&amount<=500000){
        System.out.println("tax to be paid is "+(amount*0.2));
    }
    else if(amount>500000&&amount<1000000){
        System.out.println("Tax to be paid is "+(amount*0.3));
    }

    }
}
