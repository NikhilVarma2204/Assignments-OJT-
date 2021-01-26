package BankingSystem;

public class CurrentAccounts extends Account {
   public CurrentAccounts(int b,int c){
       balance=b;
       creditLimit=c;
   }
   void creditAmount(int amount){
       System.out.println("The credit amount is "+amount)
   }
   void getCash(){
       System.out.println("The balance in  your amount is "+balance);
    
   }
}
