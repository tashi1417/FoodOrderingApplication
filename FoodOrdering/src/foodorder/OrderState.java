package foodorder;
import FoodOrdering.order.OrderState;
// interface OrderState { // Interface defining the order state
//     void handleOrder(); // Method to handle the order based on its state
// }

class NewOrderState implements OrderState { // Concrete implementation of the OrderState interface for a new order
    @Override
    public void handleOrder() { // Implementation of the handleOrder() method
        System.out.println("New order placed."); // Print a message indicating a new order placement
    }
}

class ProcessedOrderState implements OrderState { // Concrete implementation of the OrderState interface for a processed order
    @Override
    public void handleOrder() { // Implementation of the handleOrder() method
        System.out.println("Order processed."); // Print a message indicating order processing
    }
}

class ShippedOrderState implements OrderState { // Concrete implementation of the OrderState interface for a shipped order
    @Override
    public void handleOrder() { // Implementation of the handleOrder() method
        System.out.println("Order shipped."); // Print a message indicating order shipping
    }
}

class OrderContext { // Class to manage the order state
    private OrderState state; // Instance variable to hold the current order state

    public void setState(OrderState state) { // Method to set the current order state
        this.state = state;
    }

    public void handleOrder() { // Method to handle the order based on its current state
        state.handleOrder(); // Call the handleOrder() method of the current order state
    }
}