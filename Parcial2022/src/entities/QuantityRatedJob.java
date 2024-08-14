package entities;

public class QuantityRatedJob extends Job {
    private double quantity;

    // Getters & Setters
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    @Override
    public double getJobCost(){
        return this.getQuantity() * super.getWorkType().getQuantityRate();
    }
}

