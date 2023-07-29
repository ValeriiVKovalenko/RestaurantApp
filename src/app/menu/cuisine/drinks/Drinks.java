package app.menu.cuisine.drinks;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public enum Drinks {
    COFFEE("Coffee", BigDecimal.valueOf(3.50)),
    TEA("Tea", BigDecimal.valueOf(2.80)),
    SODA("Soda", BigDecimal.valueOf(2.00)),
    LEMONADE("Lemonade", BigDecimal.valueOf(2.50)),
    JUICE("Juice", BigDecimal.valueOf(3.00));

    private final String name;
    private final BigDecimal price;

    Drinks(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<Drinks> getAllAdditions() {
        return Arrays.asList(values());
    }
}