public class Product {
    private double length;
    private double width;
    private double height;
    private double weight;

    public Product(double length, double width, double height, double weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
