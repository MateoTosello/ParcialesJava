package entities;

import java.util.LinkedList;

public class Menu  extends Catering{

    private String name;
    private double unitCost;
    private int quantity;

    private LinkedList<Catering> cateringsList = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LinkedList<Catering> getCateringsList() {
        return cateringsList;
    }

    public void setCateringsList(LinkedList<Catering> cateringsList) {
        this.cateringsList = cateringsList;
    }
}
