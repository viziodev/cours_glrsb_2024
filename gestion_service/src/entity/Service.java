package entity;
public class Service extends Entity{
    private String zone;

    public Service() {
    }

    public Service(String code, String name, String zone) {
        super(code, name);
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    @Override
    public String affiche() {
        return super.affiche()+ ", Zone=" + zone  ;
    }
    
}
