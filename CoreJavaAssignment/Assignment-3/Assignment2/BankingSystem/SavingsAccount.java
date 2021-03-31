package BankingSystem;

public class SavingsAccount extends Account {
   
    public SavingsAccount(int b,double i){
         balance=b;
         intererst=i;
        }
        void getWithdrawl(int amount){
            withdrawl_amount=amount;
            System.out.println("The amount debited is "+amount);
            
        }
        void getDeposit(int amount){
            System.out.println("the total balance in your account is "+(balance+amount));
        }
        void getCash(){
            System.out.println("The balance in the account is "+(balance-withdrawl_amount));
        }
}
