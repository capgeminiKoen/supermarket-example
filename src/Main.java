import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the supermarket!");

        Product soap = new Product("Soap", 300);
        Product cereals = new Product("Cereals", 250);
        Product yoghourt = new Product("Yoghourt", 200);
        Product diapers = new Product("Diapers", 1000);
        Product chineseVegetables = new Product("Chinese Vegetables", 500);

        ShoppingCart shoppingCart = new ShoppingCart();

        // demo addition to shoppingcart
        shoppingCart.add(soap);
        shoppingCart.add(cereals);

        // demo removal form shoppingcart
        shoppingCart.remove(soap);

        shoppingCart.add(chineseVegetables);
        shoppingCart.add(yoghourt);
        shoppingCart.add(diapers);
        shoppingCart.add(cereals);
        shoppingCart.add(soap);

        // Checkout
        CashRegister cashRegister = new CashRegister();
        cashRegister.checkout(shoppingCart, 3000);
    }
}
