import java.util.List;

public class CashRegister {
    public void checkout(ShoppingCart shoppingCart, int money) {
        System.out.println();
        System.out.println("Checking out..");

        // Print out contents of shoppingcart
        shoppingCart.printContents();

        // Calculate the total amount we have to pay
        int total = shoppingCart.calculateTotal();

        System.out.println();
        System.out.println("The total is: " + total);


        // Calculate the discount:
        int discount = calculateDiscount(total);

        System.out.println("The discount is: " + discount);

        int moneyToPay = total - discount;

        System.out.println("You have to pay: " + moneyToPay);
        System.out.println("You paid: " + money);
        System.out.println("The change is: " + (money - moneyToPay));
    }

    private int calculateDiscount(int total) {
        if(total >= 2000) {
            return 100;
        }
        else if(total >= 1000) {
            return 50;
        }
        return 0;
    }
}
