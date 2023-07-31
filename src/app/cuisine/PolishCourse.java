package app.cuisine;

import app.model_interface.CourseItem;

import java.math.BigDecimal;

public enum PolishCourse implements CourseItem {
    POLISH_SOUP("polish soup", BigDecimal.valueOf(22.1)),
    POLISH_MEAT("polish meat", BigDecimal.valueOf(1.1));

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
