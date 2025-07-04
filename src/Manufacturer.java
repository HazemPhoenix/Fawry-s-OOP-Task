public class Manufacturer {
    private String name;
    private String address;
    private Sector sector;

    public Manufacturer(String name, String address, Sector sector) {
        this.name = name;
        this.address = address;
        this.sector = sector;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public Sector getSector() {
        return this.sector;
    }

    public void setSector(Sector sector){
        this.sector = sector;
    }

}
