package foodorder;
import FoodOrdering.payment.PaymentContext;
import FoodOrdering.product.Product;
import FoodOrdering.order.Order;
import FoodOrdering.order.OrderHandler;
import FoodOrdering.Customer;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {s
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext paymentContext = new PaymentContext();

        while (true) {
            printWelcomeMessage();
            printRoleOptions();
            System.out.print("\033[1mEnter your choice: \033[0m");
            String userRole = scanner.nextLine();

            if (userRole.equalsIgnoreCase("3")) {
                printThankYouMessage();
                break;
            }

            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter current address: ");
            String address = scanner.nextLine();
            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            if (userRole.equalsIgnoreCase("1")) {
                Admin admin = new Admin(name, address, email);
                handleAdmin(admin, scanner);
            } else if (userRole.equalsIgnoreCase("2")) {
                Customer customer = new Customer(name, address, email);
                handleCustomer(customer, scanner, paymentContext);
            } else {
                System.out.println("\033[1mInvalid choice. Please try again.\033[0m");
            }
        }

        scanner.close();
    }

    private static void printRoleOptions() {
        System.out.println("\033[1mPlease select your role:\033[0m");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Exit");
    }
    private static void handleAdmin(Admin admin, Scanner scanner) {
        AdminSingleton adminSingleton = AdminSingleton.getInstance();
        System.out.println("=====================================");
        System.out.println("\033[1mWelcome, " + admin.getName() + "!\033[0m");
        System.out.println("=====================================");

        while (true) {
            System.out.println("\033[1mAdmin options: \033[0m");
            System.out.println("1. Add product");
            System.out.println("2. Update product");
            System.out.println("3. Delete product");
            System.out.println("4. Logout");
            System.out.print("\033[1mChoose an option: \033[0m");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (option == 4) {
                System.out.println("=====================================");
                System.out.println("\033[1mThank you for Coming To Our Food App, " + admin.getName() + "!\033[0m");
                System.out.println("=====================================");
                break;
            }

            System.out.print("\033[1mEnter product ID: \033[0m");
            String productId = scanner.nextLine();

            System.out.print("\033[1mEnter product name: \033[0m");
            String productName = scanner.nextLine();
            System.out.print("\033[1mEnter product description: \033[0m");
            String productDescription = scanner.nextLine();
            System.out.print("\033[1mEnter product price: \033[0m");
            double productPrice = scanner.nextDouble();
            System.out.print("\033[1mEnter Quantity : \033[0m");
            int stockLevel = scanner.nextInt();
            scanner.nextLine(); // consume newline
            Product product = new Product(productId, productName, productDescription, productPrice, stockLevel);

            if (option == 1) {
                adminSingleton.addProduct(product);
                System.out.println("\033[1mProduct added by admin: " + admin.getName() + "\033[0m");
            } else if (option == 2) {
                adminSingleton.updateProduct(product);
                System.out.println("\033[1mProduct updated by admin: " + admin.getName() + "\033[0m");
            } else if (option == 3) {
                adminSingleton.deleteProduct(productId);
                System.out.println("\033[1mProduct deleted by admin: " + admin.getName() + "\033[0m");
            }

            System.out.println("------------------------");
        }
    }

    private static void handleCustomer(Customer customer, Scanner scanner, PaymentContext paymentContext) {
        FoodCart cart = new FoodCart();
        System.out.println("=====================================");
        System.out.println("\033[1mWelcome, " + customer.getName() + "!\033[0m");
        System.out.println("=====================================");
    
        while (true) {
            System.out.println("\033[1mCustomer options: \033[0m");
            System.out.println("1. View products");
            System.out.println("2. Add product to Food cart");
            System.out.println("3. View cart");
            System.out.println("4. Checkout");
            System.out.println("5. Logout");
            System.out.print("\033[1mChoose an option: \033[0m");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline
    
            if (option == 5) {
                System.out.println("=====================================");
                System.out.println("\033[1mThank you for Ordering from us, " + customer.getName() + "!\033[0m");
                System.out.println("=====================================");
                break;
            }
    
            if (option == 1) {
                displayProducts();
            } else if (option == 2) {
                System.out.print("\033[1mEnter Food product ID: \033[0m");
                String productId = scanner.nextLine();
                Product product = AdminSingleton.getInstance().getProduct(productId);
                if (product == null) {
                    System.out.println("\033[1mFood Product not found.\033[0m");
                } else {
                    System.out.print("\033[1mEnter quantity: \033[0m");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    cart.addProduct(product, quantity);
                    System.out.println("\033[1mProduct added to Food cart.\033[0m");
                }
            } else if (option == 3) {
                if (cart.isEmpty()) {
                    System.out.println("\033[1mYour Food cart is empty.\033[0m");
                } else {
                    System.out.println("\033[1mProducts in your Food cart:\033[0m");
                    for (Product product : cart.getProducts()) {
                        System.out.println(
                                product.getName() + " - Nu " + product.getPrice() + " x " + cart.getQuantity(product));
                    }
                    System.out.println("\033[1mTotal cost: Nu " + cart.totalCost() + "\033[0m");
                }
            } else if (option == 4) {
                if (cart.isEmpty()) {
                    System.out.println("\033[1mYour Food cart is empty.\033[0m");
                } else {
                    double totalCost = cart.totalCost();
                    System.out.println("\033[1mTotal cost: Nu " + totalCost + "\033[0m");
                    System.out.println("\033[1mSelect payment method: \033[0m");
                    System.out.println("1. Cash");
                    System.out.println("2. MBob");
                    System.out.println("3. MPay");
                    System.out.println("4. DK");
                    System.out.print("\033[1mEnter your choice: \033[0m");
                    int paymentOption = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    switch (paymentOption) {
                        case 1:
                            paymentContext.setPaymentStrategy(new CashPayment());
                            break;
                        case 2:
                            paymentContext.setPaymentStrategy(new MBobPayment());
                            break;
                        case 3:
                            paymentContext.setPaymentStrategy(new MPayPayment());
                            break;
                        case 4:
                            paymentContext.setPaymentStrategy(new DKPayment());
                            break;
                        default:
                            System.out.println("\033[1mInvalid payment option.\033[0m");
                            continue;
                    }

                    // Create an order
                    Order order = new Order(customer, new ArrayList<>(cart.getProducts()), totalCost);

                    // Process the order
                    OrderHandler inventoryHandler = new InventoryHandler();
                    OrderHandler paymentHandler = new PaymentHandler();
                    OrderHandler shippingHandler = new ShippingHandler();

                    inventoryHandler.setNext(paymentHandler).setNext(shippingHandler);
                    inventoryHandler.handle(order);

                    paymentContext.executePayment(totalCost);

                    System.out.println("\033[1mCheckout complete.\033[0m");
                    cart.clear();
                }
            }
        }

        System.out.println("\033[1m------------------------\033[0m]");
    }

    private static void displayProducts() {
        AdminSingleton adminSingleton = AdminSingleton.getInstance();
        Map<String, Product> adminProducts = adminSingleton.getProducts();

        if (adminProducts.isEmpty()) {
            System.out.println("\033[1mNo Food products available.\033[0m");
        } else {
            System.out.println("\033[1mDisplaying available Food products:\033[0m");
            for (Product product : adminProducts.values()) {
                System.out.println("Product ID: " + product.getProductId());
                System.out.println("Name: " + product.getName());
                System.out.println("Description: " + product.getDescription());
                System.out.println("Price: Nu " + product.getPrice());
                System.out.println("Quantity: " + product.getStockLevel());
                System.out.println("------------------------");
            }
        }
    }

    private static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("\033[1mWelcome To Our Food Ordering Application!\033[0m");
        System.out.println("=====================================");
    }

    private static void printThankYouMessage() {
        System.out.println("=====================================");
        System.out.println("\033[1mThank you for visiting our Application!\033[0m");
        System.out.println("=====================================");
    }

}
