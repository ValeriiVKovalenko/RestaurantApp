package app.menu.cuisine.mexican;

import app.Dessert;

import java.math.BigDecimal;

public enum MexicanDessert implements Dessert {
    CHURROS("Churros", BigDecimal.valueOf(4.50)),
    FLAN("Flan", BigDecimal.valueOf(3.80)),
    TRES_LECHES("Tres Leches", BigDecimal.valueOf(4.90)),
    ARROZ_CON_LECHE("Arroz con Leche", BigDecimal.valueOf(3.70)),
    PASTEL_DE_TRES_LECHES("Pastel de Tres Leches", BigDecimal.valueOf(5.20));

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