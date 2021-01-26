package WorkingCities;

public class Transaction extends Trader {
    private Trader trader;
    private int year;
    private int value;
    public Transaction(Trader trader,int year,int value){
        super();
        this.trader=trader;
        this.year=year;
        this.value=value;
    }
}
