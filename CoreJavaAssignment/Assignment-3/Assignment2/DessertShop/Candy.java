package Assignment2.DessertShop;

import java.util.Scanner;

public class Candy extends Dessert {
    public int addCandy(int ice){
        System.out.println("Give me your role: 1 for Owner or 2 for Customer");
        Scanner sc = new Scanner(System.in);
       int role= sc.nextInt(); 
       if(role==1){
           System.out.println("enter the flavours of the candies you want into the menu: ");
           for(int i=0;i<ice;i++){
               Scanner sc2= new Scanner(System.in);
               String g = sc2.nextLine(); 
               System.out.println("So, you want to add "+g+" into the menu.Nice!! ");
               System.out.println("\n");
           }
           
       }
       else
       System.out.println("Hello customer, i see you have placed order of "+ice+" candies!");
          getCost(ice);

       
        return 0;
    }

    @Override
    void getCost(int h) {
        System.out.println("The bill for "+h+" candies would be: "+1*h+" euros which would be: "+1*h*70+" Rupees");

    } 
}
