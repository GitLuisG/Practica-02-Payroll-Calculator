package edu.upv.poo;

public class CommissionEmployee extends Employee {
    
    private double sales;
    private double commissionRate;
    
    public CommissionEmployee(
            String firstName, String lastName,
            String rfc, double sales,
            double commissionRate) {
        super(firstName, lastName, rfc);
        setSales(sales);
        setCommissionRate(commissionRate);
    }

    /**
     * @return the sales
     */
    public final double getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public final void setSales(double sales) {
        this.sales = sales;
        if (sales < 0.0) this.sales = 0.0;
    }

    /**
     * @return the commissionRate
     */
    public final double getCommissionRate() {
        return commissionRate;
    }

    /**
     * @param commissionRate the commissionRate to set
     */
    public final void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
        if (commissionRate < 0.0)
            this.commissionRate = 0.0;
        else if (commissionRate > 1.0)
            this.commissionRate = 1.0;
    }
    
    @Override
    public double earnings() {
        return getSales() * getCommissionRate();
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s (Commission Employee): " +
                "$%,.2f sales, %.2f commission",
                super.toString(), getSales(),
                getCommissionRate());
    }
    
}
