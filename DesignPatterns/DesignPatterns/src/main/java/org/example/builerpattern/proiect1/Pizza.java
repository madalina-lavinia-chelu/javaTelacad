package org.example.builerpattern.proiect1;

public class Pizza {
    private String dough;
    private String sauce;
    private String toppings;

    public Pizza(String dough, String sauce, String toppings) {
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + ", " + sauce + ", " + toppings;
    }
}
