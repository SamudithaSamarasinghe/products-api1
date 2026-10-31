//1. A PhysicalProduct IS-A Product because it extends the Product class and
// inherits its properties and methods, such as id, name, price, and their getters.

// 2. An Order class would NOT pass this test because an order is not a product;
// it represents a customer's purchase of one or more products

package uk.ac.westminster.products_api;

import java.io.Serializable;

public class PhysicalProduct extends Product implements Discountable {
    private Double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct() {}

    public PhysicalProduct(long id, String name, double price,Double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
        this.discountedPrice = price;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getSummary() {
        return getName() + " | weight : " +  getWeightKg () + " | dimensions : " + getDimensions();
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
