package edu.upv.poo;


public class Invoice implements Payable {
    
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(
            String partNumber, String partDescription,
            int quantity, double pricePerItem) {
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    /**
     * @return the partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * @param partNumber the partNumber to set
     */
    public final void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * @return the partDescription
     */
    public String getPartDescription() {
        return partDescription;
    }

    /**
     * @param partDescription the partDescription to set
     */
    public final void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the pricePerItem
     */
    public double getPricePerItem() {
        return pricePerItem;
    }

    /**
     * @param pricePerItem the pricePerItem to set
     */
    public final void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    
    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }
    
    @Override
    public String toString() {
        return String.format(
                "Invoice: Part # %s (%s). Q = %d | PPI = $%,.2f",
                getPartNumber(), getPartDescription(),
                getQuantity(), getPricePerItem());
    }
    
}
