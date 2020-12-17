import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Cart {

    private Map<ShipperType, Function<Product, Double>> shipperMap = new HashMap<>() {{
        put(ShipperType.BLACK_CAT, (product) -> {
            if (product.getWeight() > 20) {
                return 500D;
            } else {
                return 100 + product.getWeight() * 10;
            }
        });
        put(ShipperType.HSINCHU, (product) -> {
            if (product.getLength() > 100 || product.getWidth() > 100 || product.getHeight() > 100) {
                return product.getSize() * 0.00002 * 1100 + 500;
            } else {
                return product.getSize() * 0.00002 * 1200;
            }
        });
        put(ShipperType.POST_OFFICE, (product) -> {
            double feeByWeight = 80 + product.getWeight() * 10;
            double feeBySize = product.getSize() * 0.00002 * 1100;
            return Math.min(feeByWeight, feeBySize);
        });
    }};

    public double shippingFee(String shipperName, Product product) {
        final ShipperType shipperType = ShipperType.getEnum(shipperName);
        if (!shipperMap.containsKey(shipperType)) {
            throw new IllegalArgumentException("shipper not exist");
        }
        return shipperMap.get(shipperType).apply(product);
    }

}
