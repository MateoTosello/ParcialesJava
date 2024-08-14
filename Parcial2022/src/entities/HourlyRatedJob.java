package entities;

import java.util.LinkedList;

public class HourlyRatedJob extends Job {
    private Contratist contratists = new Contratist();

    // Getters & Setters
    public Contratist getContratists() {
        return contratists;
    }

    public void setContratists(Contratist contratists) {
        this.contratists = contratists;
    }

    @Override
    public double getJobCost(){
        return this.getEstimatedHours()* contratists.getHourlyRate();
    }
}

