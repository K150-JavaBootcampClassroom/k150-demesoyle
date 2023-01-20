

public class CherryStorage { // açıklamma için apple clasına bak aynısı
    private double cherryCurrenAmount;
    private Sellİnfo sellİnfo;
    private double reduceAmount;
    private double addAmount;


    public CherryStorage(double cherryCurrenAmount, Sellİnfo sellİnfo,double addAmount) {
        this.reduceAmount=sellİnfo.getSaleAmount();
        this.cherryCurrenAmount=cherryCurrenAmount-reduceAmount;
        this.addAmount=addAmount;
        if (addAmount!=0){
            this.cherryCurrenAmount=addAmount+cherryCurrenAmount;
        }else {
            this.cherryCurrenAmount=cherryCurrenAmount;

        }


    }



}
