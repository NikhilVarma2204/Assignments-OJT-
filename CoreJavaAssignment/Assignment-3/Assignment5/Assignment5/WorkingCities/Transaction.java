package Assignment5.WorkingCities;

public class Transaction  {
    Trader trader;
    int year;
    int value;
    public Transaction(Trader trader,int year,int value){
        
        this.trader=trader;
        this.year=year;
        this.value=value;
    }
}
