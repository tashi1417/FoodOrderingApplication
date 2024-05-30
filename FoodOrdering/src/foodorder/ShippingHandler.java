package foodorder;
import FoodOrdering.order.Order;
import FoodOrdering.order.OrderHandler;


public class ShippingHandler extends OrderHandler { // Concrete class for handling shipping
    @Override
    public void handle(Order order) { // Implementation of the handle() method
        System.out.println("Shipping order..."); // Print a message indicating order shipping
        super.handle(order); // Call the handle() method of the next handler in the chain
    }
}