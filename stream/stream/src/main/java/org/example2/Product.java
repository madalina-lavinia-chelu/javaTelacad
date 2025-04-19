package org.example2;

public class Product {
    private Integer id;
    private String name;
    private Double price;
    private String category;

    public Product(Integer id, String name, Double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product applyDiscount(double percentage) {
        return new Product(id, name, price * (1 - percentage / 100), category);
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public Double getPrice() { return price; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return name + " - " + price + " RON (" + category + ")";
    }
}
