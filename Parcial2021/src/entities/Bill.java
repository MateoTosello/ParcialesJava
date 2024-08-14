package entities;

import java.util.LinkedList;

public class Bill {

    LinkedList<BillItem> billItemsList = new LinkedList<>();

    public double getTotal(LinkedList<BillItem> items, boolean includeTax){
        double total = 0;
        for(BillItem item : items){
            total += item.getUnitPrice() * item.getQuantity();
        }
        if(includeTax){
            total *= 1.21;
        }


        return total;
    }
}
