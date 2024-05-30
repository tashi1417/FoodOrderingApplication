package foodorder;

import FoodOrdering.order.OrderTemplate;

// This concrete class extends OrderTemplate and implements the abstract methods
public class OnlineOrder extends OrderTemplate {
    @Override
    protected void selectProduct() {
        System.out.println("Selecting product online...");
    }

    @Override
    protected void makePayment() {
        System.out.println("Making online payment...");
    }

    @Override
    protected void deliver() {
        System.out.println("Delivering to customer address...");
    }
}
