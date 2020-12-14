import java.util.HashMap;

public class Cart {

    private HashMap<String, Shipper> shipperMap = new HashMap<>() {{
        put("black cat", new BlackCat());
        put("hsinchu", new Hsinchu());
        put("post office", new PostOffice());
    }};

    public double shippingFee(String shipperName, Product product) {
        if (!shipperMap.containsKey(shipperName)) {
            throw new IllegalArgumentException("shipper not exist");
        }
        return shipperMap.get(shipperName).calculateFee(product);
    }

}