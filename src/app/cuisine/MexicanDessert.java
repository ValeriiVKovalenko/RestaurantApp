package app.cuisine;

import app.model_interface.DessertItem;

import java.math.BigDecimal;

public enum MexicanDessert implements DessertItem {
    MEXICAN_DESSERT("mexican dessert", BigDecimal.valueOf(22.1));

    private final String name;
    private final BigDecimal price;

    MexicanDessert(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}