public class THYimpl implements İFlightCompanyStrategy,İFoodStategy {
// THy için iki stateji implementasyon ettim .
    // biri yemek hizemti için
    // biride yurt içi mi yurt  dışı mı ona göre şirket seçiminden kaynaklı bir durum oluşsun istedim.
    @Override
    public void stategy(Customer customer) {
        if(FlightType.FOREİGN.equals(customer.getFlightType())){
            double yurtdısıparam=1.3;
            // mesafe ile alakalı caseler çok belirtilmediği için bu kısmı yoruma dahilinde  açıklamaya bırakıyorum.
            // burada mesa belirtilmiş durumda olsa en son çıktı olarak gidiş mesafesi * parametre gibi bişi yapar
            // total price eşitlerdik .
        }
        if(FlightType.DOMESTİC.equals(customer.getFlightType())){
            //-------
        }
    }

    @Override
    public void food(CompanySelection companySelection) {
        if(CompanySelection.THY.equals(companySelection)){
            System.out.println("hem yurt içi hem yurt dışı seyehatlerinizde yemek hizmetimizden faydalanacaksınız... :-)");
        }

    }
}
