package foodorder;
import FoodOrdering.payment.PaymentStrategy;

public class MPayPayment implements PaymentStrategy { // MPayPayment class implements the PaymentStrategy interface
    @Override
    public void pay(double amount) { // Implementation of the pay() method from the PaymentStrategy interface
        System.out.println("Paid Nu " + amount + " using MPay."); // Print a message indicating payment using MPay
    }
}