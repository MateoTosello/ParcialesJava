package entities;

import java.util.LinkedList;

public class Catering extends Event{

    private double fixedCost;

    private LinkedList<Menu> menusList = new LinkedList<>();

    public LinkedList<Menu> getMenusList() {
        return menusList;
    }

    public void setMenusList(LinkedList<Menu> menusList) {
        this.menusList = menusList;
    }

    public double getFixedCost() {
        return fixedCost;
    }

    public void setFixedCost(double fixedCost) {
        this.fixedCost = fixedCost;
    }

    @Override
    public double GetOveralCost(){
        double servicesCost = super.GetOveralCost();
        double cateringCost;
        double menusCost = 0;

        for (Menu menu : menusList) {
            menusCost += menu.getUnitCost() * menu.getQuantity();
        }

        cateringCost = servicesCost + fixedCost + menusCost;

        return cateringCost;
    }

}
