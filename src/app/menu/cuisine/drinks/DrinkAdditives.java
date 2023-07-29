package app.menu.cuisine.drinks;

import java.math.BigDecimal;

public enum DrinkAdditives {
    ICE("Ice", BigDecimal.valueOf(0.50)),
    LEMON("Lemon", BigDecimal.valueOf(0.30)),
    MILK("Milk", BigDecimal.valueOf(0.70)),
    SUGAR("Sugar", BigDecimal.valueOf(0.20)),
    WHIPPED_CREAM("Whipped Cream", BigDecimal.valueOf(0.80));

    private final String name;
    private final BigDecimal price;

    DrinkAdditives(String name, BigDecimal price) {
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
