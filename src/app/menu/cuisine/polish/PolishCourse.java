package app.menu.cuisine.polish;

import app.MainCourse;

import java.math.BigDecimal;

public enum PolishCourse implements MainCourse {
    JELLIED_CARP("Jellied carp", BigDecimal.valueOf(22.22)),
    SCHABOWY("Schabowy", BigDecimal.valueOf(22.22)),
    SOUR_CUCUMBER_SOUP("Sour cucumber soup", BigDecimal.valueOf(22.22)),
    BIGOS("Bigos", BigDecimal.valueOf(22.22)),
    POLISH_BEEF_TRIPE("Polish beef tripe", BigDecimal.valueOf(22.22));

    private final String name;
    private final BigDecimal price;

    PolishCourse(String name, BigDecimal price) {
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