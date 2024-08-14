package entities;

import java.util.LinkedList;

public class Artist extends Show{

    private String name;
    private double hourlyCost;

    private LinkedList<Show> showsList = new LinkedList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(double hourlyCost) {
        this.hourlyCost = hourlyCost;
    }

    public LinkedList<Show> getShowsList() {
        return showsList;
    }

    public void setShowsList(LinkedList<Show> showsList) {
        this.showsList = showsList;
    }
}
