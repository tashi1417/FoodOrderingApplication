package foodorder;

import java.util.ArrayList; // Import for ArrayList
import java.util.HashMap; // Import for HashMap
import FoodOrdering.product.Product;

// import designpattern.Product; // Commented out import, assumed Product class exists

// Class representing a shopping cart
public class FoodCart {
    // HashMap to store products and their quantities
    private HashMap<Product, Integer> cartItems = new HashMap<>();

    // Adds a product to the cart with a specified quantity
    public void addProduct(Product product, int quantity) {
        // If product already in cart, increase the quantity
        if (cartItems.containsKey(product)) {
            cartItems.put(product, cartItems.get(product) + quantity);
        } else {
            // Otherwise, add the product with the specified quantity
            cartItems.put(product, quantity);
        }
        product.reduceStock(quantity); // Reduce the stock of the product
    }

    // Returns a list of all products in the cart
    public ArrayList<Product> getProducts() {
        return new ArrayList<>(cartItems.keySet());
    }

    // Returns the quantity of a specified product in the cart
    public int getQuantity(Product product) {
        return cartItems.get(product);
    }

    // Calculates the total cost of all products in the cart
    public double totalCost() {
        double total = 0;
        for (Product product : cartItems.keySet()) {
            // Sum up the price of each product multiplied by its quantity
            total += product.getPrice() * cartItems.get(product);
        }
        return total;
    }

    // Checks if the cart is empty
    public boolean isEmpty() {
        return cartItems.isEmpty();
    }

    // Clears all items from the cart
    public void clear() {
        cartItems.clear();
    }
}
