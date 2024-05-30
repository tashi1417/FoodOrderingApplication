package foodorder;
import java.util.ArrayList;
import java.util.List;

import FoodOrdering.product.Product;
import FoodOrdering.observer.Observer;

// interface Observer { // Interface defining the Observer pattern
//     void update(); // Method to update the observer
// }

class ProductObserver implements Observer { // Concrete implementation of the Observer interface
    private List<Product> products = new ArrayList<>(); // List to store the observed products

    @Override
    public void update() { // Implementation of the update() method from the Observer interface
        for (Product product : products) { // Iterate over the observed products
            System.out.println("Product updated: " + product.getName()); // Print a message indicating that the product has been updated
        }
    }

    public void addProduct(Product product) { // Method to add a product to the list of observed products
        products.add(product);
    }
}