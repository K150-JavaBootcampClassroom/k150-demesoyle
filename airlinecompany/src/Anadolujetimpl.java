public class Anadolujetimpl   implements İFlightCompanyStrategy,İFoodStategy{
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
        if(CompanySelection.ANADOLUJET.equals(companySelection)){
            System.out.println("Bizde yemek yok  :'(");
        }

    }
}
