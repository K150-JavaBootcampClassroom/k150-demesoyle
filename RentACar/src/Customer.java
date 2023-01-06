import java.util.Scanner;
public class Customer {
    private String name;
    private String email;
    private int phoneNumber;
    private String customerCity;
    public Customer() {
    }

    public Customer(String name, String email, int phoneNumber, String customerCity){
        this.customerCity=customerCity;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;

    }

    public static int selectedCarModelYear ;
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
            System.out.println("arabalar :");

            // gösterilecek araba seçenekleri
            for (int i = 0; i < Suv.listCompany.size(); i++) {
                System.out.println((i+1) + ". " + Suv.listCompany.get(i));
            }

            // kulanıcıdan kaçıncı arba isteği
            Scanner input = new Scanner(System.in);
            System.out.print("kaçıncı arabayı seçtiğinizi belirtiniz: ");
            int selection1 = input.nextInt();

            // seçilen araba
            Car selectedCar = Suv.listCompany.get(selection1-1);

        }else if (selection.equals("kişi")){
            //kişi ise sadece Hatçbagleri görebilsin
            for (Car car :Hatchback.listkisi) {
                System.out.println("Model Yılı: " + car.getModelYear());
                System.out.println("Marka: " + car.getCarBrand());
                System.out.println("Renk: " + car.getCarColor());
                System.out.println("Yolcu Kapasitesi: " + car.getPassCapacity());
            }
            System.out.println("arabalarrr:");

            // gösterilecek arabalar
            for (int i = 0; i < Hatchback.listkisi.size(); i++) {
                System.out.println((i+1) + ". " + Hatchback.listkisi.get(i));
            }
            // kulanıcıdan araba seçim isteği
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of the car you want to select: ");
            int selection2 = input.nextInt();

            // seçilen araba
            Car selectedCar = Hatchback.listkisi.get(selection2-1);
            int selectedCarModelYear=selectedCar.getModelYear();

            //ücret hesabı için yıl bazlı oran




        }

    }

}