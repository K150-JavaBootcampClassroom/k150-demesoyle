import java.util.ArrayList;

public class Hatchback extends Car{

    //   double parameter=1;
    public static ArrayList<Car> listCompany=new ArrayList<Car>();
    public double dailyFee=300.0;
    public static ArrayList<Car> listkisi=new ArrayList<Car>();
    public int trunkVolume;
    public double harchBackRate=1.0;
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

    @Override
    public void axiom(){

        //ücret hesabı için
        double rate = Car.nowYear/(double)Customer.selectedCarModelYear;
        double carFee=rate*harchBackRate*dailyFee;
        System.out.println("kiraladığınız her gün için günlük"+carFee);


    }



}