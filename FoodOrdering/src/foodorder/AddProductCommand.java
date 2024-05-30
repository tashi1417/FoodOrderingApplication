package foodorder;
import FoodOrdering.product.Product;
// 
// import OnlineShopping.product.Command;

interface Command { // Interface defining a command
    void execute(); // Method to execute the command
}

public class AddProductCommand implements Command { // Concrete implementation of the Command interface
    private AdminSingleton admin; // Instance variable to hold the AdminSingleton instance
    private Product product; // Instance variable to hold the product

    public AddProductCommand(AdminSingleton admin, Product product) { // Constructor to initialize the instance variables
        this.admin = admin;
        this.product = product;
    }

    @Override
    public void execute() { // Implementation of the execute() method from the Command interface
        admin.addProduct(product); // Call the addProduct() method on the AdminSingleton instance with the product
    }
}