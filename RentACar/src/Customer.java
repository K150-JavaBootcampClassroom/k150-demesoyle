import java.util.Scanner;
public class Customer {
    private String name;
    private String email;
    private int phoneNumber;
    private String customerCity;
    public Customer() {
    }

    public Customer(String name, String email, int phoneNumberNumber, String customerCity){
        this.customerCity=customerCity;
        this.name=name;
        this.phoneNumber=phoneNumberNumber;
        this.email=email;

    }


    public void axiom(){
        System.out.println("lütfen dumunuzu belirtiniz. ");
        System.out.println("şirket için :company veya  şahış olarak:kişi yazınız ");

        Scanner sc= new Scanner(System.in);
        String selection=sc.nextLine();
        if(selection.equals("company")){
                //tüm araçları görebilsin
            for (Car car :Suv.listCompany ) {
                System.out.println("Model Yılı: " + car.getModelYear());
                System.out.println("Marka: " + car.getCarBrand());
                System.out.println("Renk: " + car.getCarColor());
                System.out.println("Yolcu Kapasitesi: " + car.getPassCapacity());
            }
            for (Car car :Sedan.listCompany ) {
                System.out.println("Model Yılı: " + car.getModelYear());
                System.out.println("Marka: " + car.getCarBrand());
                System.out.println("Renk: " + car.getCarColor());
                System.out.println("Yolcu Kapasitesi: " + car.getPassCapacity());
            }
            for (Car car :Hatchback.listCompany) {
                System.out.println("Model Yılı: " + car.getModelYear());
                System.out.println("Marka: " + car.getCarBrand());
                System.out.println("Renk: " + car.getCarColor());
                System.out.println("Yolcu Kapasitesi: " + car.getPassCapacity());
            }

        }else if (selection.equals("kişi")){
            //kişi ise sadece Hatçbagleri görebilsin
            for (Car car :Hatchback.listkisi) {
                System.out.println("Model Yılı: " + car.getModelYear());
                System.out.println("Marka: " + car.getCarBrand());
                System.out.println("Renk: " + car.getCarColor());
                System.out.println("Yolcu Kapasitesi: " + car.getPassCapacity());
            }


        }

    }



}