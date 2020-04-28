package edu.upv.poo;

public class Practica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Practica 02");
        new Practica02().run();
    }
    
    public void run() {
        Employee[] employees = getEmployees();
        PayrollCalculator.calc(employees);
        Payable[] payables = getAllPayables();
        calcTotalToPay(payables);
    }
    
    private Employee[] employees;
    private Payable[] allPayables;
    
    public Employee[] getEmployees() {
        if (employees == null) {
            employees = new Employee[4];
            employees[0] = new SalariedEmployee(
                    "Roberto", "Flores", "FFF00",
                    12332.2);
            employees[1] = new HourlyEmployee(
                    "Luis", "de la Fuente", "DDD",
                    100.3, 45.0);
            employees[2] = new CommissionEmployee(
                    "Rolando", "Fuentes", "RRRR",
                    342432.34, 0.15);
            employees[3] = new BasePlusCommissionEmployee(
                    "Fernando", "Garza", "FFGG",
                    54353.54, 0.05, 5000.0);
        }
        return employees;
    }
    
    public Payable[] getAllPayables() {
        if (allPayables != null)
            return allPayables;
        Employee[] empls = getEmployees();
        allPayables = new Payable[] { 
            empls[0], empls[1], empls[2], empls[3],
            new Invoice("043", "SEAT", 2, 375.0),
            new Invoice("432", "TIRE", 4, 79.99),
            new Invoice("431", "R SEAT", 2, 456.12)
        };
        return allPayables;
    }
    
    public double calcTotalToPay(Payable[] payables) {
        System.out.println("Calculing total to pay...");
        double total = 0.0;
        for (Payable p : payables) {
            System.out.println(p);  // <- call toString()
            System.out.printf(
                    "  -> $%,.2f\n", p.getPaymentAmount());
            total += p.getPaymentAmount();
        }
        System.out.printf("TOTAL = $%,.2f\n", total);
        return total;
    }
    
}
