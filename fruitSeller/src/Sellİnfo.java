public class Sellİnfo {// satım ile ilgili olan class
    private double saleAmount;// satım miktarı
    private double normalPrice;// elden satılanacak olan malın fiyatı
    private double onlinePrice;// online'e özel fiyat

    private SellType sellType;// satım çeşidi sabit olduğundan enumdan gelecek
    private double totalPrice; // müşteriye son mikarı gösterim için toplam miktar


//  ----------------koşula bağlanmış konstraktır--------------------
    public Sellİnfo(double saleAmount, double normalPrice, double onlinePrice,SellType sellType) { // burdaki konstraktır metotdunda
        this.saleAmount = saleAmount;                                           //  miktar zounlu olacak ancak online
                                                                             // veya normal satıştan biri olacak ----
                                                                                // onlie satış ya da normal satış
        if (normalPrice == 0 && onlinePrice != 0) {
            this.onlinePrice = onlinePrice;
        } else if (normalPrice != 0 && onlinePrice == 0) {
            this.normalPrice = normalPrice;
        } else {
            this.normalPrice = normalPrice;
            this.onlinePrice = onlinePrice;
            this.sellType=sellType;
        }
    }

// klasik getr setrlar ----------------
    public double getSaleAmount(){
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public double getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(double normalPrice) {
        this.normalPrice = normalPrice;
    }

    public double getOnlinePrice() {
        return onlinePrice;
    }

    public void setOnlinePrice(double onlinePrice) {
        this.onlinePrice = onlinePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public SellType getSellType() {
        return sellType;
    }

    public void setSellType(SellType sellType) {
        this.sellType = sellType;
    }
}
