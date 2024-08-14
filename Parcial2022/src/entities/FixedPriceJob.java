package entities;

public class FixedPriceJob extends Job {
    private double agreedBudget;

    // Getters & Setters
    public double getAgreedBudget() {
        return agreedBudget;
    }

    public void setAgreedBudget(double agreedBudget) {
        this.agreedBudget = agreedBudget;
    }

//    @Override
//    public double getJobCost() {
//        return agreedBudget + super.getJobCost(); //getJobCost() tiene que ser abstracto si o si porque la clase es abstracta?
//    }

    @Override
    public double getJobCost() {
        return agreedBudget; //getJobCost() tiene que ser abstracto si o si porque la clase es abstracta?
    }

}

