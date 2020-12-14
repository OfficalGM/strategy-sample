public class Cart {

    private final BlackCat blackCat = new BlackCat();

    public double shippingFee(String shipper, Product product) {
        switch (shipper) {
            case "black cat":
                return blackCat.calculateFee(product);
            case "hsinchu": {
                return calculateByHsinchu(product);
            }
            case "post office": {
                return calculateByPostOffice(product);
            }
            default:
                throw new IllegalArgumentException("shipper not exist");
        }
    }


    double calculateByHsinchu(Product product) {
        if (product.getLength() > 100 || product.getWidth() > 100 || product.getHeight() > 100) {
            return product.getSize() * 0.00002 * 1100 + 500;
        } else {
            return product.getSize() * 0.00002 * 1200;
        }
    }

    double calculateByPostOffice(Product product) {
        double feeByWeight = 80 + product.getWeight() * 10;
        double feeBySize = product.getSize() * 0.00002 * 1100;
        return Math.min(feeByWeight, feeBySize);
    }
}