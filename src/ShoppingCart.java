import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products = new ArrayList<>();

    // Add product
    public void add(Product product) {
        System.out.println("Adding product " + product + " to the shopping cart.");
        products.add(product);
    }

    // Remove product
    public void remove(Product product) {
        System.out.println("Removing product " + product + " from the shopping cart");
        products.remove(product);
    }

    // Print contents
    public void printContents() {
        System.out.println("These are the contents of your shopping cart:");
        for (Product product: products) {
            System.out.println(product);
        }
    }

    // Calculate total value
    public int calculateTotal() {
        int total = 0;
        for(Product product: products) {
            total += product.getPrice();
        }
        return total;
    }
}
