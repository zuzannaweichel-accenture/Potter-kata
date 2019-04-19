public class PotterKata {

    static double discount(BOOK[] cart) {
        double unitPrice = 8.00;
        double total = unitPrice * cart.length;
        double discount = 0;
        if (cart.length == 1){
            return unitPrice;
        }
        if (cart.length == 2){
            discount= total * BUNDLE.twoBooks.getDiscount();
        }
        if (cart.length == 3) {
            discount = total * BUNDLE.threeBooks.getDiscount();
        }
        if (cart.length == 4) {
            discount = total * BUNDLE.fourBooks.getDiscount();
        }
        return total - discount;
    }
}
