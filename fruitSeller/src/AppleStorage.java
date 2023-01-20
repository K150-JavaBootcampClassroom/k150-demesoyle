public class AppleStorage { // e/lma için depo
    private double appleCurrenAmount; // mevut  elma miktarı
    private Sellİnfo sellİnfo;  // satıştan gelecek olan info bilgisi alım oldu mu
    private double reduceAmount; // miktardaki azalma
    private double addAmount; // halden gelecek olan artım

// yapıcı metotda info gelecek . eğer ekleme yoksa  diye kontrol ettim satımda güncellenecek .
   // ---------- bu class diğer depo clasları ile aynı
    public AppleStorage(double appleCurrenAmount, Sellİnfo sellİnfo,double addAmount) {
        this.reduceAmount=sellİnfo.getSaleAmount();
        this.appleCurrenAmount=appleCurrenAmount-reduceAmount;
        this.addAmount=addAmount;
        if (addAmount!=0){
            this.appleCurrenAmount=addAmount+appleCurrenAmount;
        }else {
            this.appleCurrenAmount=appleCurrenAmount;

        }


    }



}