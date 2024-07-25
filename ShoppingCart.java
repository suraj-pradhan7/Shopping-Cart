import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    // Create or Add product to the cart
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product);
    }

    // Read or View all products in the cart
    public void viewCart() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your cart:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // Update product in the cart
    public void updateProduct(int productId, Product updatedProduct) {
        for (Product product : products) {
            if (product.getId() == productId) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                System.out.println("Product updated: " + product);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Delete product from the cart
    public void removeProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
        System.out.println("Product removed with ID: " + productId);
    }

    // Checkout
    public void checkout() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        System.out.println("Total amount: ₹" + total);
        products.clear();
        System.out.println("Thank you for shopping!");
    }
}
