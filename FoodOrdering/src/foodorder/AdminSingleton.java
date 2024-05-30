package foodorder;
import java.util.HashMap;
import java.util.Map;

import FoodOrdering.product.Product;

public class AdminSingleton {
    private static AdminSingleton instance;
    private Map<String, Product> products;

    private AdminSingleton() {
        products = new HashMap<>();
    }

    public static synchronized AdminSingleton getInstance() {
        if (instance == null) {
            instance = new AdminSingleton();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            products.put(product.getProductId(), product);
        } else {
            System.out.println("Product with ID " + product.getProductId() + " does not exist.");
        }
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }

    public Map<String, Product> getProducts() {
        return products;
    }
}