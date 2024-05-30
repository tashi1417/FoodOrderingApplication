package foodorder;

import FoodOrdering.order.Order;
import FoodOrdering.order.OrderHandler;

public class PaymentHandler extends OrderHandler { // Concrete class for handling payment
    @Override
    public void handle(Order order) { // Implementation of the handle() method
        System.out.println("Processing payment..."); // Print a message indicating payment processing
        super.handle(order); // Call the handle() method of the next handler in the chain
    }
}
