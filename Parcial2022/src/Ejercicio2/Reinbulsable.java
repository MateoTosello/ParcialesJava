package Ejercicio2;

import java.util.LinkedList;

public class Reinbulsable {

    LinkedList<Expenditure> expeditures = new LinkedList<>();

    public double getReimbursement(LinkedList<Expenditure> expenditures,double reimbursementPorcentage){
        double totalCost = 0;
        for(Expenditure e : expeditures){
            if(e.isReimbursable()){
                totalCost += e.getAmount() * reimbursementPorcentage
            }
        }

        return totalCost;
    }
}
