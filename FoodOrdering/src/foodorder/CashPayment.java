package foodorder;
import FoodOrdering.payment.PaymentStrategy;
public class CashPayment implements PaymentStrategy { // CashPayment class implements the PaymentStrategy interface
    @Override
    public void pay(double amount) { // Implementation of the pay() method from the PaymentStrategy interface
        System.out.println("Paid Nu " + amount + " using Cash."); // Print a message indicating payment using cash
    }
}