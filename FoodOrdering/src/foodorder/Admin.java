package foodorder;

public class Admin {
    private String name; // Private instance variable to store the name of the admin
    private String address; // Private instance variable to store the address of the admin
    private String email; // Private instance variable to store the email of the admin

    public Admin(String name, String address, String email) { // Constructor to initialize the instance variables
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() { // Getter method to retrieve the name of the admin
        return name;
    }

    public String getAddress() { // Getter method to retrieve the address of the admin
        return address;
    }

    public String getEmail() { // Getter method to retrieve the email of the admin
        return email;
    }
}