package foodorder;
import FoodOrdering.order.OrderTemplate;

// This concrete class extends OrderTemplate and implements the abstract methods
public class InStoreOrder extends OrderTemplate {
    @Override
    protected void selectProduct() {
        System.out.println("Selecting product in store...");
    }

    @Override
    protected void makePayment() {
        System.out.println("Making in-store payment...");
    }

    @Override
    protected void deliver() {
        System.out.println("Handing over product to customer...");
    }
}