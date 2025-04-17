package org.example.builerpattern.proiect1;

public class PizzaBuilder {
    private String dough;
    private String sauce;
    private String toppings;

    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public Pizza build() {
        return new Pizza(dough, sauce, toppings);
    }
}
