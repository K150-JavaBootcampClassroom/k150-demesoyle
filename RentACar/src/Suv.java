import java.util.ArrayList;
public class Suv extends Car{
    private int groundClearance;
    public static ArrayList<Car> listCompany=new ArrayList<Car>();
    public Suv(int modelYear,String carBrand,String carColor,int passCapacity,int groundClearance){
        super(modelYear,carBrand,carColor,passCapacity);
        this.groundClearance=groundClearance;
        listCompany.add(this);
    }

    public int getGroundClearance(){
        return this.groundClearance;
    }
    @Override
    public String toString() {
        return "Model year: " + getModelYear() + ", Brand: " + getCarBrand() + "," +
                " Color: " + getCarColor() + ", Passanger capacity: " + getPassCapacity()+
                " groundClearance: "+getGroundClearance();
    }


    public static void main(String[] args) {
        Suv suv1=new Suv(2020,"kia","kırmızı",5,1);
        System.out.println(suv1);

    }



}