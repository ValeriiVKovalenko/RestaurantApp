package app.cuisine;

import app.model_interface.CourseItem;

import java.math.BigDecimal;

public enum ItalianCourse implements CourseItem {
    ITALIAN_SOUP("italian soup", BigDecimal.valueOf(22.1));

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