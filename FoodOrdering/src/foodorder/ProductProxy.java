package foodorder;
import FoodOrdering.product.ProductService;
// interface ProductService {
//     void displayProduct();
// }

// Proxy class for ProductService
public class ProductProxy implements ProductService {
    private ProductServiceImpl productService; // Real service instance
    private String productName; // Name of the product

    // Constructor initializes the productName
    public ProductProxy(String productName) {
        this.productName = productName;
    }

    // Displays the product details using the real service, loading it lazily
    @Override
    public void displayProduct() {
        if (productService == null) {
            // Initialize the real service only when needed
            productService = new ProductServiceImpl(productName);
        }
        productService.displayProduct(); // Delegate to the real service
    }
}
