package app.menu.cuisine.polish;

import app.Dessert;

import java.math.BigDecimal;

public enum PolishDessert implements Dessert {
    PACZKI("Pączki", BigDecimal.valueOf(2.50)),
    SZARLOTKA("Szarlotka", BigDecimal.valueOf(3.00)),
    MAKOWIEC("Makowiec", BigDecimal.valueOf(2.80)),
    SERNIK("Sernik", BigDecimal.valueOf(3.20)),
    KREMOWKA("Kremówka", BigDecimal.valueOf(2.70));

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