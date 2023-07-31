package app.drink;

import java.math.BigDecimal;

public enum DrinkCollection {
    COCA_COLA("Coca-cola", BigDecimal.valueOf(10)),
    SPRITE("Sprite", BigDecimal.valueOf(15)),
    TEA("Tea", BigDecimal.valueOf(20)),
    COFFEE("Coffee", BigDecimal.valueOf(25));

    private final String name;
    private final BigDecimal price;

    DrinkCollection(String name, BigDecimal price) {
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