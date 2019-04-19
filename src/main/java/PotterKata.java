import java.util.HashMap;
import java.util.Map;

public class PotterKata {

    private BOOK[] cart;
    private Map<Integer, Double> discounts = new  HashMap<Integer, Double>(){{
        put(1, 0.0);
        put(2, 0.05);
        put(3, 0.10);
    }};


    double discount(BOOK[] cart) {
        this.cart = cart;
        double unitPrice = 8.00;
        double total = unitPrice * cart.length;
        double discountedPrice = total * discounts.get(this.cart.length);
        return total - discountedPrice;
    }
}
