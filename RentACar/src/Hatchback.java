import java.util.ArrayList;

public class Hatchback extends Car{

    //   double parameter=1;
    public static ArrayList<Car> listCompany=new ArrayList<Car>();
    public static ArrayList<Car> listkisi=new ArrayList<Car>();
    int trunkVolume;
    public Hatchback(int modelYear,String carBrand,String carColor,int passCapacity,int trunkVolume){
        super(modelYear,carBrand,carColor,passCapacity);
        this.trunkVolume=trunkVolume;
        listCompany.add(this);
        listkisi.add(this);

    }
    public int getTrunkVolume(){
        return this.trunkVolume;
    }

    @Override
    public String toString() {
        return "Model year: " + getModelYear() + ", Brand: " + getCarBrand() + "," +
                " Color: " + getCarColor() + ", Passanger capacity: " + getPassCapacity()+
                " Trank Volume: "+getTrunkVolume();
    }

}