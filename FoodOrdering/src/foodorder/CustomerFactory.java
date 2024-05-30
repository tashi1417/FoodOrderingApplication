package foodorder;
import java.util.UUID;

public class CustomerFactory {
    public Customer createCustomer(String name, String address, String email) { // Method to create a new Customer instance
        return new Customer(name, address, email); // Create and return a new Customer instance with the provided parameters
    }
}

class Customer {
    private UUID customerID; // Private instance variable to store the unique customer ID
    private String name; // Private instance variable to store the name of the customer
    private String address; // Private instance variable to store the address of the customer
    private String email; // Private instance variable to store the email of the customer

    public Customer(String name, String address, String email) { // Constructor to initialize the instance variables
        this.customerID = UUID.randomUUID(); // Generate a random UUID for the customer ID
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public UUID getCustomerID() { // Getter method to retrieve the customer ID
        return customerID;
    }

    public String getName() { // Getter method to retrieve the name of the customer
        return name;
    }
    public String getAddress() { // Getter method to retrieve the address of the customer
        return address;
    }
    
    public String getEmail() { // Getter method to retrieve the email of the customer
        return email;
    }
}