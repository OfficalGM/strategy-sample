import java.util.HashMap;

public class Cart {

    private HashMap<ShipperType, Shipper> shipperMap = new HashMap<>() {{
        put(ShipperType.BLACK_CAT, new BlackCat());
        put(ShipperType.HSINCHU, new Hsinchu());
        put(ShipperType.POST_OFFICE, new PostOffice());
    }};

    public double shippingFee(String shipperName, Product product) {
        final ShipperType shipperType = ShipperType.getEnum(shipperName);
        if (!shipperMap.containsKey(shipperType)) {
            throw new IllegalArgumentException("shipper not exist");
        }
        return shipperMap.get(shipperType).calculateFee(product);
    }

}