//1. A PhysicalProduct IS-A Product because it extends the Product class and
// inherits its properties and methods, such as id, name, price, and their getters.

// 2. An Order class would NOT pass this test because an order is not a product;
// it represents a customer's purchase of one or more products

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private Double weightKg;
    private String dimensions;

    public PhysicalProduct() {}

    public PhysicalProduct(long id, String name, double price,Double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
