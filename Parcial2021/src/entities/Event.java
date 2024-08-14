package entities;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Event {

    private LocalDateTime eventDate;
    private String Location;

    private LinkedList<Service> ServicesList = new LinkedList<>();
    private Client client = new Client();

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public LinkedList<Service> getServicesList() {
        return ServicesList;
    }

    public void setServicesList(LinkedList<Service> servicesList) {
        ServicesList = servicesList;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double GetOveralCost(){
        double overalCost = 0;
        for(Service service : ServicesList){
            double cost = service.getCost();
            overalCost += cost;
        }

        return overalCost;
    }
}
