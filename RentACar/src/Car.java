import java.util.Scanner; // ---------------gerekli importlar
import java.util.ArrayList;
import java.time.LocalDate;


public class Car {  //car adında bir clas olşturuldu.  özellikler  bellirlendi .
    private int modelYear;
    private String carBrand;

    private String carColor;
    private int passCapacity;




    LocalDate localDate = LocalDate.now(); // arabaların eski ve yeni oluşuna göre ayrılması için
    // şimdi ki yılı alamk için oluşturulan nesne

    int nowYear = localDate.getYear(); // şimdi ki yıl değişkeni



    //---------------initiation kısmı için konstraktır method
    //----------------bununla birlikte değişkenleri zorunlu olarak belirlenip nesne oluşturulabilecek ...
    public Car(int modelYear,String carBrand,String carColor,int passCapacity){
        this.carBrand=carBrand;
        this.carColor=carColor;
        this.passCapacity=passCapacity;
        this.modelYear=modelYear;

    }


// eklenen araçların dizi durumunu görünteleyebilmek için metot
    public String toString() {
        return "Model year: " + modelYear + ", Brand: " + carBrand + ", Color: " + carColor + "," +
                " Passanger capacity: " + passCapacity;
    }

    //----------değişkenlere erişim için get metod
    public int getModelYear(){
        return this.modelYear;
    }
    public int getPassCapacity(){
        return this.passCapacity;
    }
    public String getCarBrand(){
        return this.carBrand;
    }
    public String getCarColor(){
        return this.carColor;
    }



    //--------değişkenlerin değiştirlebilmesi için set metod
    public void setModelYear(int modelYear){
        this.modelYear=modelYear;
    }
    public void setPassCapacity(int passCapacity){
        this.passCapacity=passCapacity;
    }

    public void setCarBrand(String carBrand){
        this.carBrand=carBrand;
    }
    public void setCarColor(String carColor){
        this.carColor=carColor;
    }




}



