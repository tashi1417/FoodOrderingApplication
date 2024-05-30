package foodorder;

import FoodOrdering.payment.Payment;

import FoodOrdering.Component;

interface Mediator { // Interface defining the Mediator pattern
    void notify(Component sender, String event); // Method to notify the mediator about an event
}

class ConcreteMediator implements Mediator { // Concrete implementation of the Mediator interface
    private Customer customer; // Instance variable to hold the Customer object
    private FoodCart cart; // Instance variable to hold the ShoppingCart object
    private Payment payment; // Instance variable to hold the Payment object

    public void setCustomer(Customer customer) { // Method to set the Customer object
        this.customer = customer;
    }

    public void setShoppingCart(FoodCart cart) { // Method to set the ShoppingCart object
        this.cart = cart;
    }

    public void setPayment(Payment payment) { // Method to set the Payment object
        this.payment = payment;
    }

    @Override
    public void notify(Component sender, String event) { // Implementation of the notify() method from the Mediator interface
        if (event.equals("orderPlaced")) { // If the event is "orderPlaced"
            System.out.println("Order has been placed successfully."); // Print a message indicating a successful order placement
        }
    }
}