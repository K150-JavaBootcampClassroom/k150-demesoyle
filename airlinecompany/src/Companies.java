public class Companies {
    THYimpl thYimpl;
    Anadolujetimpl anadolujetimpl;
    Pegasusimpl pegasusimpl;
    // burda şirketlerin konstraktırlarını teker teker oluşturdum .  çünkü burdan
    // parametre olarak geçeceğim Ticketmoney clasında bir şirket seçilebilmesi için--
    // - orda hesaplama yapıldığında bir şirkete özgü ücret alınabilir diye düşünüdm.


    public Companies(THYimpl thYimpl) {
        this.thYimpl = thYimpl;
    }

    public Companies(Anadolujetimpl anadolujetimpl) {
        this.anadolujetimpl = anadolujetimpl;
    }

    public Companies(Pegasusimpl pegasusimpl) {
        this.pegasusimpl = pegasusimpl;
    }

    public THYimpl getThYimpl() {
        return thYimpl;
    }

    public void setThYimpl(THYimpl thYimpl) {
        this.thYimpl = thYimpl;
    }

    public Anadolujetimpl getAnadolujetimpl() {
        return anadolujetimpl;
    }

    public void setAnadolujetimpl(Anadolujetimpl anadolujetimpl) {
        this.anadolujetimpl = anadolujetimpl;
    }

    public Pegasusimpl getPegasusimpl() {
        return pegasusimpl;
    }

    public void setPegasusimpl(Pegasusimpl pegasusimpl) {
        this.pegasusimpl = pegasusimpl;
    }
}
