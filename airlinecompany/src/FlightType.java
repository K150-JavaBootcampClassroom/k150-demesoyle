public enum FlightType {// uçuş tipleri sabit olduğundan enum olarak tasarladık
    DOMESTİC("Yurtiçi"),
    FOREİGN("Yurtdışı");
    private String type;


    FlightType(String type) {
        this.type=type;
    }
    public String getType(){

        return type;
    }
}
