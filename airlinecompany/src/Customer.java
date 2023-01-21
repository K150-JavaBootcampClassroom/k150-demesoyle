public class Customer {
    private String name;
    private int  id;
    private FlightType flightType;
    private CompanySelection companySelection;


    public Customer(String name, int id, FlightType flightType, CompanySelection companySelection) {
        this.name = name;
        this.id = id;
        this.flightType = flightType;
        this.companySelection = companySelection;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public CompanySelection getCompanySelection() {
        return companySelection;
    }

    public void setCompanySelection(CompanySelection companySelection) {
        this.companySelection = companySelection;
    }


}
