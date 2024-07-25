import java.util.Scanner;

public class ShoppingCartApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("Shopping Cart Options:");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Update Product");
            System.out.println("4. Remove Product");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    Product product = new Product(id, name, price);
                    cart.addProduct(product);
                    break;
                case 2:
                    cart.viewCart();
                    break;
                case 3:
                    System.out.print("Enter product ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter new product name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new product price: ");
                    double newPrice = scanner.nextDouble();
                    Product updatedProduct = new Product(updateId, newName, newPrice);
                    cart.updateProduct(updateId, updatedProduct);
                    break;
                case 4:
                    System.out.print("Enter product ID to remove: ");
                    int removeId = scanner.nextInt();
                    cart.removeProduct(removeId);
                    break;
                case 5:
                    cart.checkout();
                    break;
                case 6:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
