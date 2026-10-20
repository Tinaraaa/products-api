package uk.ac.westminster.products_api;
//Physical Producst IS A Product
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
        super();
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super();
        this.weightKg = weightKg;
        this.dimensions = dimensions;

    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
