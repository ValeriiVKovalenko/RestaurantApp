package app.menu.cuisine.mexican;

import app.MainCourse;

import java.math.BigDecimal;

public enum MexicanCourse implements MainCourse {
    TACOS("Tacos", BigDecimal.valueOf(8.50)),
    BURRITOS("Burritos", BigDecimal.valueOf(9.80)),
    ENCHILADAS("Enchiladas", BigDecimal.valueOf(10.50)),
    FAJITAS("Fajitas", BigDecimal.valueOf(11.70)),
    CHILES_RELLENOS("Chiles Rellenos", BigDecimal.valueOf(12.20));

    private final String name;
    private final BigDecimal price;

    MexicanCourse(String name, BigDecimal price) {
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
