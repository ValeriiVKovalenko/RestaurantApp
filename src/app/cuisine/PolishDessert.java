package app.cuisine;

import app.model_interface.DessertItem;

import java.math.BigDecimal;

public enum PolishDessert implements DessertItem {
    POLISH_DESSERT("polish dessert", BigDecimal.valueOf(22.1));

    private final String name;
    private final BigDecimal price;

    PolishDessert(String name, BigDecimal price) {
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
