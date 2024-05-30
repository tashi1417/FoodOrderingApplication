package foodorder;

import FoodOrdering.Component;

public class SingleProduct extends Component { // Concrete class representing a single product
    private double price; // Instance variable to store the price of the product

    public SingleProduct(double price) { // Constructor to initialize the price
        this.price = price;
    }

    @Override
    public double getPrice() { // Implementation of the getPrice() method
        return price;
    }
}
