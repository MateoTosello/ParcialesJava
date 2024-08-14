package entities;

import java.util.LinkedList;

public class Service {

    private String name;
    private double cost;
    private LinkedList<Event> EventsList = new LinkedList<>();

    public LinkedList<Event> getEventsList() {
        return EventsList;
    }

    public void setEventsList(LinkedList<Event> eventsList) {
        EventsList = eventsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
