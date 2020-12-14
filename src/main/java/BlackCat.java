public class BlackCat {

    public BlackCat() {

    }

    public double calculateFee(Product product) {
        if (product.getWeight() > 20) {
            return 500;
        } else {
            return 100 + product.getWeight() * 10;
        }
    }

}
