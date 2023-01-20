public class PearStorage { // açıklama için appledepo clasına bak aynısı buranın.
    private double pearCurrentAmount;
    private Sellİnfo sellİnfo;
    private double reduceAmount;
    private double addAmount;


    public PearStorage(double pearCurrentAmount, Sellİnfo sellİnfo,double addAmount) {
        this.reduceAmount=sellİnfo.getSaleAmount();
        this.pearCurrentAmount = pearCurrentAmount -reduceAmount;
        this.addAmount=addAmount;
        if (addAmount!=0){
            this.pearCurrentAmount =addAmount+ pearCurrentAmount;
        }else {
            this.pearCurrentAmount = pearCurrentAmount;

        }

    }

}