package edu.upv.poo;

public class PayrollCalculator {
    
    public static double calc(Employee[] employees) {
        System.out.println("Calculating Payroll");
        double total = 0.0;
        for (Employee e : employees) {
            System.out.println(e);
            double earnings = e.earnings();
            System.out.printf("  -> $%,.2f \n", earnings);
            total += earnings;
        }
        System.out.printf("TOTAL: $%,.2f", total);
        return total;
    }
    
}
