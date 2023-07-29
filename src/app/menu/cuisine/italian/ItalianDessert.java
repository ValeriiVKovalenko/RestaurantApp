package app.menu.cuisine.italian;

import app.Dessert;
import app.MainCourse;

import java.math.BigDecimal;

public enum ItalianDessert implements Dessert {
    TIRAMISU("Tiramisu", BigDecimal.valueOf(5.50)),
    PANNACOTTA("Panna Cotta", BigDecimal.valueOf(4.80)),
    CANNOLI("Cannoli", BigDecimal.valueOf(3.90)),
    GELATO("Gelato", BigDecimal.valueOf(4.20)),
    AFFOGATO("Affogato", BigDecimal.valueOf(4.50));

    private final String name;
    private final BigDecimal price;

    ItalianDessert(String name, BigDecimal price) {
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
