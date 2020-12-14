public enum ShipperType {

    BLACK_CAT, HSINCHU, POST_OFFICE;

    public static ShipperType getEnum(String name) {
        if (name == null || name.length() < 1) {
            return null;
        }
        for (ShipperType t : values()) {
            if (t.name().equalsIgnoreCase(name)) {
                return t;
            }
        }
        return null;
    }
}
