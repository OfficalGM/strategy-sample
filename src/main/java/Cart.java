public class Cart {

    public double shippingFee(String shipperName, Product product) {
        Shipper shipper;
        switch (shipperName) {
            case "black cat":
                shipper = new BlackCat();
                break;
            case "hsinchu": {
                shipper = new Hsinchu();
                break;
            }
            case "post office": {
                shipper = new PostOffice();
                break;
            }
            default:
                throw new IllegalArgumentException("shipper not exist");
        }
        return shipper.calculateFee(product);
    }
}