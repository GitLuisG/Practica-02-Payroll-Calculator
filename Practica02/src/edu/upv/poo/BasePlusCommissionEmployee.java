package edu.upv.poo;

public class BasePlusCommissionEmployee
        extends CommissionEmployee {
    
    private double baseSalary;
    
    public BasePlusCommissionEmployee(
            String firstName, String lastName,
            String rfc, double sales, 
            double commissionRate,
            double baseSalary) {
        super(firstName, lastName, rfc, sales, commissionRate);
        setBaseSalary(baseSalary);
    }
    
    public final void setBaseSalary(double baseSalary){
        this.baseSalary = 
                baseSalary < 0.0 ? 0.0 : baseSalary;
    }
    
    public final double getBaseSalary() {
        return baseSalary;
    }
    
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
    
    @Override
    public String toString() {
        return super.toString() + " PLUS BASE -> " +
                String.format("$%,.2f", getBaseSalary());
    }
}
