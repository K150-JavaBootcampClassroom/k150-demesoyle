public class SellFruitİmpl implements IsellFruit { // interfaceden implement ettik
    private Sellİnfo sellİnfo; // bu class iş yapabilmesi için önce sell info nun oluşması lazım
    private Fruit fruit;// hangi meyveden
    private double soldFruit; // satım mikarı


    // meyvenin satım işini yapacak metot -----burda meyve ve info versek satacak
    @Override
    public void sellFruit(Fruit fruit, Sellİnfo sellİnfo) {
        // burda artık sellfruitimpl calsı çalıştı ve satış nesnesi oluştu .
        // bu kısımda bu metot bana satış işlemini geçekşetirecek . parametre olarak meyve gelecek
        // ve satış bilgisi gelecek .....
            if (SellType.NORMAL.equals(sellİnfo.getSellType())){
                //seçim normal satış olursa
                soldFruit=sellİnfo.getSaleAmount();
                sellİnfo.setTotalPrice(soldFruit*sellİnfo.getNormalPrice());
                System.out.println("toplam tutar "+sellİnfo.getTotalPrice());

            }else {  // burda önceki if çalışmaz ise  yani seçim normal değil online olurs bu kısım çlışacak
                soldFruit=sellİnfo.getSaleAmount();
                sellİnfo.setTotalPrice(soldFruit*sellİnfo.getOnlinePrice());
                System.out.println("toplam tutar "+sellİnfo.getTotalPrice());
            }



    }

    public SellFruitİmpl(Sellİnfo sellİnfo, Fruit fruit) {
        this.sellİnfo = sellİnfo;
        this.fruit = fruit;
    }

}
