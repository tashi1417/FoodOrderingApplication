package foodorder;
import FoodOrdering.payment.PaymentStrategy;

public class DKPayment implements PaymentStrategy { // DKPayment class implements the PaymentStrategy interface
    @Override
    public void pay(double amount) { // Implementation of the pay() method from the PaymentStrategy interface
        System.out.println("Paid Nu " + amount + "using DK."); // Print a message indicating payment using DK
    }
}