package foodorder;

import FoodOrdering.product.ProductService;

// Implementation of the ProductService interface
public class ProductServiceImpl implements ProductService {
    private String productName; // Name of the product

    // Constructor initializes the productName and loads the product from database
    public ProductServiceImpl(String productName) {
        this.productName = productName;
        loadFromDatabase(); // Simulate loading product details from the database
    }

    // Simulates loading product data from the database
    private void loadFromDatabase() {
        System.out.println("Loading product " + productName + " from database...");
    }

    // Displays the product details
    @Override
    public void displayProduct() {
        System.out.println("Displaying product " + productName);
    }
}

