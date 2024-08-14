package Ejercicio2;

import java.util.Date;

public class Expenditure {

    private boolean reimbursable;
    private double amount;
    private Date date;


    // Constructor con parámetros
    public Expenditure(boolean reimbursable, double amount, Date date) {
        this.reimbursable = reimbursable;
        this.amount = amount;
        this.date = date;
    }

    // Getter para reimbursable
    public boolean isReimbursable() {
        return reimbursable;
    }

    // Setter para reimbursable
    public void setReimbursable(boolean reimbursable) {
        this.reimbursable = reimbursable;
    }

    // Getter para amount
    public double getAmount() {
        return amount;
    }

    // Setter para amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter para date
    public Date getDate() {
        return date;
    }

    // Setter para date
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expenditure that = (Expenditure) o;

        if (reimbursable != that.reimbursable) return false;
        if (Double.compare(that.amount, amount) != 0) return false;
        return date != null ? date.equals(that.date) : that.date == null;
    }

    @Override
    publ
