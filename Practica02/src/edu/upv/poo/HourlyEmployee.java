package edu.upv.poo;


public class HourlyEmployee extends Employee {
    
    private double wage;
    private double hours;
    
    public HourlyEmployee(
            String firstName, String lastName,
            String rfc, double wage, double hours) {
        super(firstName, lastName, rfc);
        setHours(hours);
        setWage(wage);
    }

    /**
     * @return the wage
     */
    public final double getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public final void setWage(double wage) {
        this.wage = wage;
    }

    /**
     * @return the hours
     */
    public final double getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public final void setHours(double hours) {
        if (hours < 0.0)
            this.hours = 0.0;
        else if (hours > 168.0)
            this.hours = 168.0;
        else
            this.hours = hours;
    }
    
    @Override
    public double earnings() {
        if (getHours() <= 40.0)
            return getWage() * getHours();
        else
            return 40.0 * getWage() + 
                    (getHours() - 40.0) * getWage() * 1.5;
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s (Hourly Employee): $%,.2f wage, %,.1f hours",
                super.toString(), getWage(), getHours());
    }
    
}
