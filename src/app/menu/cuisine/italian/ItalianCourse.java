package app.menu.cuisine.italian;

import app.MainCourse;

import java.math.BigDecimal;

public enum ItalianCourse implements MainCourse {
    PIZZA("Pizza", BigDecimal.valueOf(10.50)),
    PASTA_CARBONARA("Pasta Carbonara", BigDecimal.valueOf(12.80)),
    LASAGNA("Lasagna", BigDecimal.valueOf(14.50)),
    RISOTTO("Risotto", BigDecimal.valueOf(11.70)),
    OSSOBUCO("Ossobuco", BigDecimal.valueOf(15.20));

    private final String name;
    private final BigDecimal price;

    ItalianCourse(String name, BigDecimal price) {
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