package edu.upv.poo;

public class SalariedEmployee extends Employee {
    
    private double weeklySalary;
    
    public SalariedEmployee(
            String firstName, String lastName,
            String rfc, double weeklySalary) {
        super(firstName, lastName, rfc);
        setWeeklySalary(weeklySalary);
    }
    
    public final void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
        if (weeklySalary < 0.0)
            this.weeklySalary = 0.0;
    }
    
    public final double getWeeklySalary() {
        return weeklySalary;
    }
    
    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s (Salaried Employee): $%,.2f",
                super.toString(), getWeeklySalary());
    }
}
