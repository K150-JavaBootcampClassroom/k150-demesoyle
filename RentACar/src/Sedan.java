import java.util.ArrayList;
public class Sedan extends Car{


    double carLength;
    public static ArrayList<Car> listCompany=new ArrayList<Car>();


    public Sedan(int modelYear,String carBrand,String carColor,int passCapacity,double carLength){
        super(modelYear,carBrand,carColor,passCapacity);
        this.carLength=carLength;
        listCompany.add(this);
    }
    public double getCarLength() {
        return this.carLength;
    }

    @Override
    public String toString() {
        return "Model year: " + getModelYear() + ", Brand: " + getCarBrand() + "," +
                " Color: " + getCarColor() + ", Passanger capacity: " + getPassCapacity()+
                " Car Length: "+getCarLength();
    }

    //   double parameter=1.12;
//  caroldparameter şu anki yıl bölü arabanın yılı bunu da parametre
//  ile çarp bunları araba günlüklük kirasıyla çarp

}

