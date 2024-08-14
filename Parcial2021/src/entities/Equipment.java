package entities;

import java.util.LinkedList;

public class Equipment extends Show{

    private String type;
    private double cost;

    private LinkedList<Show> showsList = new LinkedList<>();

    public LinkedList<Show> getShowsList() {
        return showsList;
    }

    public void setShowList(LinkedList<Show> showList) {
        this.showsList = showList;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
