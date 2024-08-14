package entities;

public class Show extends Event{

    private String type;
    private String name;
    private double durationHs;

    private Artist artist = new Artist();
    private Equipment equipment = new Equipment();

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public double getDurationHs() {
        return durationHs;
    }

    public void setDurationHs(double durationHs) {
        this.durationHs = durationHs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double GetOveralCost(){
        double servicesCost = super.GetOveralCost();
        double showCost = 0;

        showCost = servicesCost + this.getDurationHs() * artist.getHourlyCost() + equipment.getCost();

        return showCost;

    }

}
