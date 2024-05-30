package foodorder;
import FoodOrdering.payment.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

// This class implements the Composite pattern for PaymentStrategy objects
public class PaymentComposite implements PaymentStrategy {
    private List<PaymentStrategy> strategies = new ArrayList<>();

    // Method to add a payment strategy to the composite
    public void addPaymentStrategy(PaymentStrategy strategy) {
        strategies.add(strategy);
    }

    // Method to execute the payment using all the added payment strategies
    @Override
    public void pay(double amount) {
        for (PaymentStrategy strategy : strategies) {
            strategy.pay(amount);
        }
    }
}