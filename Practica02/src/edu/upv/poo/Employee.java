package edu.upv.poo;

/**
 *
 * @author luisroberto
 */
public abstract class Employee
        implements Payable {
    
    private String firstName;
    private String lastName;
    private String rfc;

    public Employee(
            String firstName, String lastName,
            String rfc) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rfc = rfc;
    }
    
    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
    
    public abstract double earnings();
    
    @Override
    public double getPaymentAmount() {
        return earnings();
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }
    
    
    
}
