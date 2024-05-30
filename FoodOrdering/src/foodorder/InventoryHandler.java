package foodorder;

import FoodOrdering.order.Order;
import FoodOrdering.order.OrderHandler;

public class InventoryHandler extends OrderHandler { // Concrete class for handling inventory
    @Override
    public void handle(Order order) { // Implementation of the handle() method
        System.out.println("Checking inventory..."); // Print a message indicating inventory check
        super.handle(order); // Call the handle() method of the next handler in the chain
    }
}
